package firstlab;

public class TestRectangle {
	public static void main(String[] args)
	{
		Rectangle rec1=new Rectangle(4,40);
		Rectangle rec2=new Rectangle(3.5,35.9);
		rec1.setColor("red");
		rec2.setColor("red");
		System.out.println("��һ�����Σ�");
		System.out.println("��Ϊ��"+rec1.getWidth()+" ��Ϊ�� "+rec1.getHeight()+" ��ɫΪ��"+rec1.getColor());
		System.out.println("���Ϊ�� "+rec1.getArea()+" �ܳ�Ϊ�� "+rec1.getPerimeter());
		System.out.println("�ڶ����Σ�");
		System.out.println("��Ϊ��"+rec2.getWidth()+" ��Ϊ�� "+rec2.getHeight()+" ��ɫΪ��"+rec2.getColor());
		System.out.println("���Ϊ�� "+rec2.getArea()+" �ܳ�Ϊ�� "+rec2.getPerimeter());
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
