package firstlab;

import java.util.*;

public class LeastCommonMultiple {
	static int[] pri =new int[60];
	static int[][] factor1=new int[51][3];
	static int[][] factor2=new int[51][3];
	static void prime()
	{
		int number=2;
		int count=0;
		while(count<50)
		{
			boolean isPrime=true;
			for(int divisor=2;divisor<=number/2;divisor++)
			{
				if(number%divisor==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				pri[count]=number;
				count++;
			}
			number++;
		}
	}
	static int table1(int num)
	{
		int temp=0;
		int a=0;
		int count=0;
		while(true)
		{
			if(num==0||num==1) break;
			if(num%(pri[temp])==0) 
			{
				a++;
				if(a==1)
				{
					factor1[count][0]=pri[temp];
					factor1[count][1]++;
					count++;
				}
				else if(factor1[count-1][0]!=pri[temp])
				{
					factor1[count][0]=pri[temp];
					factor1[count][1]++;
					count++;
				}
				else 
				{
					factor1[count-1][1]++;
				}
				num=num/(pri[temp]);
			}
			else
				temp++;
		}
		return count;
	}
	static int table2(int num)
	{
		int temp=0;
		int count=0;
		int a=0;
		while(true)
		{
			if(num==0||num==1) break;
			if(num%(pri[temp])==0) 
			{
				a++;
				if(a==1)
				{
					factor2[count][0]=pri[temp];
					factor2[count][1]++;
					count++;
				}
				else if(factor2[count-1][0]!=pri[temp])
				{
					factor2[count][0]=pri[temp];
					factor2[count][1]++;
					count++;
				}
				else 
					factor2[count-1][1]++;
				num=num/(pri[temp]);
			}
			else
				temp++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("请输入需要进行取最大公约数的第一个数字 ");
		Scanner input = new Scanner(System.in);
		int number1=input.nextInt();
		System.out.println("请输入需要进行取最大公约数的第二个数字 ");
		int number2=input.nextInt();
		prime();
		int n1=table1(number1);
		int n2=table2(number2);
		int i=0,j=0;
		int ans=1;
		while(i<n1&&j<n2)
		{
			if(factor1[i][0]==factor2[j][0])
			{
				int temple=0;
				if(factor1[i][1]>factor2[j][1])
				{
					temple=factor1[i][1];
				}
				else
					temple=factor2[j][1];
				for(int k=1;k<=temple;k++)
				{
					ans=ans*factor1[i][0];
				}
				i++;
				j++;
			}
			else if(factor1[i][0]<factor2[j][0])
			{
				for(int k=1;k<=factor1[i][1];k++)
				{
					ans=ans*factor1[i][0];
				}
				i++;
			}
			else if(factor1[i][0]>factor2[j][0])
			{
				for(int k=1;k<=factor2[j][1];k++)
				{
					ans=ans*factor2[j][0];
				}
				j++;
			}
		}
		if(i>=n1)
		{
			while(j<n2)
			{
				for(int k=1;k<=factor2[j][1];k++)
				{
					ans=ans*factor2[j][0];
				}
				j++;
			}
		}
		if(j>=n2)
		{
			while(i<n1)
			{
				for(int k=1;k<=factor1[i][1];k++)
				{
					ans=ans*factor1[i][0];
				}
				i++;
			}
		}	
		System.out.println("最大公约数为："+ans);
	}

}
