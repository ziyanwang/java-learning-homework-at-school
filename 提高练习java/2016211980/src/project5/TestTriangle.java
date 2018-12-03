package project5;

public class TestTriangle {
	public static void main(String[] args)
	{
		Triangle t1=new Triangle(1.0,1.5,1.0,"Yellow",true);
        System.out.println("The area is :"+t1.getArea());
        System.out.println("The perimeter is :"+t1.getParimeter());
        System.out.println("The color is :"+t1.getColor());
        if(t1.isFilled()==true)
        {
        	System.out.println("It is filled");
        }
        else
        	System.out.println("It is not filled");
	}
}
