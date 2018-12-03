package firstlab;

public class TestRectangle {
	public static void main(String[] args)
	{
		Rectangle rec1=new Rectangle(4,40);
		Rectangle rec2=new Rectangle(3.5,35.9);
		rec1.setColor("red");
		rec2.setColor("red");
		System.out.println("第一个矩形：");
		System.out.println("宽为："+rec1.getWidth()+" 高为： "+rec1.getHeight()+" 颜色为："+rec1.getColor());
		System.out.println("面积为： "+rec1.getArea()+" 周长为： "+rec1.getPerimeter());
		System.out.println("第二矩形：");
		System.out.println("宽为："+rec2.getWidth()+" 高为： "+rec2.getHeight()+" 颜色为："+rec2.getColor());
		System.out.println("面积为： "+rec2.getArea()+" 周长为： "+rec2.getPerimeter());
	}
}
class Rectangle
{
	double width=1;
	double height=1;
	String color="white";
	Rectangle()
	{}
	Rectangle(double newWidth,double newHeight)
	{
		width=newWidth;
		height=newHeight;
	}
	double getWidth()
	{
		return width;
	}
	double getHeight()
	{
		return height;
	}
	String getColor()
	{
		return color;
	}
	void setWidth(double newWidth)
	{
		width=newWidth;
	}
	void setHeight(double newHeight)
	{
		height=newHeight;
	}
	void setColor(String newColor)
	{
		color=newColor;
	}
	double getArea()
	{
		return width*height;
	}
	double getPerimeter()
	{
		return 2*(width+height);
	}
}
