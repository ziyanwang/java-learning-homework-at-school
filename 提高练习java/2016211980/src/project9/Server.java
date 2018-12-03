package project9;

import java.io.DataInputStream;
import java.net.*;
import java.util.Arrays;

public class Server {
	public static void main(String[] args)
	{
		new Server();
	}
	public Server()
	{
		int ansa=0,ansb=0;
		try {DatagramSocket socketB = new DatagramSocket(8000);
			ServerSocket serverSocket=new ServerSocket(8000);
			for(int i=1;i<=3;i++)
			{
				byte[] buf = new byte[256];
				Socket socket=serverSocket.accept();
				DataInputStream inputFromClient=new DataInputStream(
						socket.getInputStream());
				int num,sleept;
				num=inputFromClient.readInt();
				sleept=inputFromClient.readInt();
				System.out.print(num+"   "+sleept+"   ");
				DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
				Arrays.fill(buf, (byte) 0);
				socketB.receive(receivePacket);
				int numb,sleepb;
				numb=Integer.parseInt(new String(buf).trim());
				DatagramPacket receivePacket2 = new DatagramPacket(buf, buf.length);
				Arrays.fill(buf, (byte) 0);
				socketB.receive(receivePacket2);
				sleepb=Integer.parseInt(new String(buf).trim());
				if(num>numb)
				{
					System.out.print("2   ");
					ansa=ansa+2;
				}
				else if(num==numb)
				{
					System.out.print("1   ");
					ansa=ansa+1;
					ansb=ansb+1;
				}
				else
				{
					System.out.print("0   ");
					ansb=ansb+2;
				}
				System.out.print(numb+"   "+sleepb+"    ");
				if(num>numb)
					System.out.println("0   ");
				else if(num==numb)
					System.out.println("1   ");
				else
					System.out.println("2   ");
			}
			System.out.println("A的总分为："+ansa+"  B的总分为："+ansb);
			if(ansa>ansb)  System.out.println("A胜利");
			else if(ansa==ansb) System.out.println("B胜利");
			else System.out.println("A与B平局啦");
		}
		catch(Exception ex)
		{
			System.out.println("Error in Server");
		}
	}
}
