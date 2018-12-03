package project8;

public class MultiThread {
	static int []numbera=new int[5];
	static int []numberb=new int[5];
	public static void main(String[] args)
	{
		System.out.println("轮数  a的睡眠秒数   a产生随机数  a本轮获得得分  b的睡眠秒数   b产生随机数  b本轮获得得分");
		//TaskThread1 ta=new TaskThread1();
		//TaskThread2 tb=new TaskThread2();
		for(int i=1;i<=3;i++)
		{
			TaskThread3 tc=new TaskThread3(i);
			tc.start();
			try {
				tc.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int ansa=0,ansb=0;
		for(int i=1;i<=3;i++)
		{
			ansa=ansa+numbera[i];
			ansb=ansb+numberb[i];
		}
		System.out.println("a的总分为："+ansa+"  b的总分为："+ansb+"  ");
		if(ansa>ansb)
			System.out.println("a获胜");
		else if(ansa<ansb)
			System.out.println("b获胜");
		else if(ansa==ansb)
			System.out.println("a与b平局");
		//tb.start();
		//ta.start();
	}
	//public static class TaskThread1 extends Thread{
	public static class TaskThread1 implements Runnable{
		private int randomnum;
		private int sleeptime;
		TaskThread1()
		{	
			sleeptime=(int)(Math.random()*2000);
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
				Thread.sleep(sleeptime);
			}
			catch(Exception ex)
			{}
			randomnum=(int)(Math.random()*11);
			//System.out.print(randomnum+"   ");
		}
	}
	public static class TaskThread2 extends Thread{
		private int randomnum;
		private int sleeptime;
		TaskThread2()
		{
			sleeptime=(int)(Math.random()*2000);
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
			   TaskThread2.sleep(sleeptime);
			}
			catch(Exception ex)
			{}
			randomnum=(int)(Math.random()*11);
			//System.out.print(randomnum+"   ");
		}
	}
	public static class TaskThread3 extends Thread{
		private int t;
		TaskThread3(int times)
		{
			t=times;
		}
		public void run()
		{
			int n1,n2;
			int s1,s2;
			TaskThread1 ta=new TaskThread1();
			TaskThread2 tb=new TaskThread2();
			tb.start();
			Thread aa=new Thread(ta);
			aa.start();
			try {
				TaskThread3.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			n1=ta.getNum();
			n2=tb.getNum();
			s1=ta.getSleepTime();
			s2=tb.getSleepTime();
			if(n1>n2)
			{
			   numbera[t]+=2;
			}
			else if(n1<n2)
			{
			   numberb[t]+=2;
			}
			else
			{
				numbera[t]+=1;
				numberb[t]+=1;
			}
			System.out.println(t+"   "+s1+"      "+n1+"         "+numbera[t]+"          "+s2+"   "+n2+"       "+numberb[t]+"   ");
			}
		}
	}


