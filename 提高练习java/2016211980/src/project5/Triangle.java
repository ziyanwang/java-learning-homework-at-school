package project5;

public class Triangle extends GeomtricObject{

	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle()
	{
	}
	public Triangle(double s1,double s2,double s3)
	{
		side1=s1;
		side2=s2;
		side3=s3;
	}
	public Triangle(double s1,double s2,double s3,String color,boolean filled)
	{
		side1=s1;
		side2=s2;
		side3=s3;
		setColor(color);
		setFilled(filled);
	}
	public double getSide1()
	{
		return side1;
	}
	public double getSide2()
	{
		return side2;
	}
	public double getSide3()
	{
		return side3;
	}
	public void setSide1(double s)
	{
		side1=s;
	}
	public void setSide2(double s)
	{
		side2=s;
	}
	public void setSide3(double s)
	{
		side3=s;
	}
	public double getParimeter()
	{
		return side1+side2+side3;
	}
	public double getArea()
	{
		double p=(side1+side2+side3)/2.0;
		double ans=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return ans;
	}
}
