package project9;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

public class Client {
	private DataOutputStream outputToServer;
	public static void main(String[] args)
	{
		new Client();
	}
	public static class TaskThreadA extends Thread{
		private int randomnum;
		private int sleeptime;
		private Socket s;
		TaskThreadA(Socket socket)
		{
			sleeptime=(int)(Math.random()*2000);
			s=socket;
			randomnum=(int)(Math.random()*11);
		}
		public int getNum()
		{
			return randomnum;
		}
		public int getSleepTime()
		{
			return sleeptime;
		}
		public void run()
		{
			try
			{
			   TaskThreadA.sleep(sleeptime);
			   
			}
			catch(Exception ex)
			{}
			
		}
	}
	public static class TaskThreadB extends Thread{
		private DatagramSocket socket;
		private byte[] buf=new byte[256];
		private DatagramPacket sendPacket;
		private int randomnum;
		private int sleeptime;
		TaskThreadB(DatagramSocket socket)
		{
			Arrays.fill(buf, (byte) 0);
			buf[0]=(byte) sleeptime;
			sleeptime=(int)(Math.random()*2000);
			this.socket=socket;
			randomnum=(int)(Math.random()*11);
			buf[1]=(byte)randomnum;
		}
		public int getNum()
		{
			return randomnum;
		}
		public int getSleepTime()
		{
			return sleeptime;
		}
		public void run()
		{
			try
			{
			   TaskThreadB.sleep(sleeptime);
			}
			catch(Exception ex)
			{
				System.out.println("Error in Thread b");
			}
			
		}
	}
	public Client()
	{
		try {
			Socket socketA=new Socket("localhost",8000);
			TaskThreadA threadA=new TaskThreadA(socketA);
			threadA.start();
			outputToServer=new DataOutputStream(socketA.getOutputStream());
			outputToServer.writeInt(threadA.randomnum);
			outputToServer.writeInt(threadA.sleeptime);
			DatagramSocket socketB=new DatagramSocket();
			TaskThreadB threadB=new TaskThreadB(socketB);
			threadB.start();
			InetAddress address=InetAddress.getByName("localhost");
			DatagramPacket sendPacket1 = new DatagramPacket(threadB.buf, threadB.buf.length, address, 8000);
			sendPacket1.setData(new Integer(threadB.randomnum).toString().getBytes());
			socketB.send(sendPacket1);
			DatagramPacket sendPacket2 = new DatagramPacket(threadB.buf, threadB.buf.length, address, 8000);
			sendPacket2.setData(new Integer(threadB.sleeptime).toString().getBytes());
			socketB.send(sendPacket2);
		}
		catch(Exception ex)
		{
		}
	}
	
}

