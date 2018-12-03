package project6;

interface Comparable<E>
{
	public int compareTo(E o);
}

interface Cloneable
{
	
};

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
	private double side;
	private double area;
	public Octagon()
	{
		side=1;
		area=(2+(4/Math.sqrt(2)))*side*side;
	}
	public Octagon(double s)
	{
		side=s;
		area=(2+(4/Math.sqrt(2)))*side*side;
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(int s)
	{
		side=s;
	}
	public double getPerimeter()
	{
		return side*8;
	}
	public double getArea()
	{
		return area;
	}
	public int compareTo(Octagon o)
	{
		if(side<o.side) return -1;
		else if(side==o.side) return 0;
		else 
			return 1;
	}
	public Octagon clone()
	{
		try {
			Octagon oo=new Octagon();
			oo.area=area;
			oo.side=side;
			return oo;
		}
		catch(Exception ex)
		{
			return null;
		}
	}
}
