package project6;

interface Colorable
{
	public void howToColor();
}

public class Square extends GeometricObject implements Colorable
{
	private double side;
	public Square()
	{
		side=0;
	}
	public Square(double side)
	{
		this.side=side;
	}
	public Square(double side,String color,boolean filled)
	{
		this.side=side;
		setColor(color);
		setFilled(filled);
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public double getSide()
	{
		return side;
	}
	public double getArea()
	{
		return side*side;
	}
	public double getPerimeter()
	{
		return side*4;
	}
	public void howToColor()
	{
		System.out.println("The color is "+getColor());
		if(isFilled()==true)
			System.out.println("It is filled");
		else
			System.out.println("It is not filled");
	}
}
