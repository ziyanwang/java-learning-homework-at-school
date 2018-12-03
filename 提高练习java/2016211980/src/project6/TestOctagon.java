package project6;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon o1=new Octagon(5);
		Octagon o2=o1.clone();
		System.out.println("第一个八边形o1的边长为："+o1.getSide()+"周长为："+o1.getPerimeter()+"面积为："+o1.getArea());
		System.out.println("第二个八边形o2（从o1拷贝来）的边长为："+o2.getSide()+"周长为："+o2.getPerimeter()+"面积为："+o2.getArea());
		System.out.println("他们的比较结果为（相等为0，<为-1，>为1）:  "+o1.compareTo(o2));
	}

}
