package firstlab;

public class TestTime {
	public static void main(String[] args)
	{
		Time t1=new Time();
		Time t2=new Time(555550000);
		System.out.println("构造的第一个：Time()");
		System.out.println("时间为："+t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
		System.out.println("构造的第二个：Time(555550000)");
		System.out.println("时间为："+t2.getHour()+":"+t2.getMinute()+":"+t2.getSecond());
	}
}

class Time
{
	private long hour;
	private long minute;
	private long second;
	Time()
	{
		long TotalMilliseconds=System.currentTimeMillis();
		long TotalSeconds=TotalMilliseconds/1000;
		long temp=TotalSeconds/(24*3600);
		TotalSeconds=TotalSeconds-temp*(24*3600);
		hour=TotalSeconds/3600;
		TotalSeconds=TotalSeconds-hour*3600;
		minute=TotalSeconds/60;
		TotalSeconds=TotalSeconds-minute*60;
		second=TotalSeconds;
	}
	Time(long TotalMilliseconds)
	{
		long TotalSeconds=TotalMilliseconds/1000;
		long temp=TotalSeconds/(24*3600);
		TotalSeconds=TotalSeconds-temp*(24*3600);
		hour=TotalSeconds/3600;
		TotalSeconds=TotalSeconds-hour*3600;
		minute=TotalSeconds/60;
		TotalSeconds=TotalSeconds-minute*60;
		second=TotalSeconds;
	}
	long getHour()
	{
		return hour;
	}
	long getMinute()
	{
		return minute;
	}
	long getSecond()
	{
		return second;
	}
}
