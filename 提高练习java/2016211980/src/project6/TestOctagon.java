package project6;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon o1=new Octagon(5);
		Octagon o2=o1.clone();
		System.out.println("��һ���˱���o1�ı߳�Ϊ��"+o1.getSide()+"�ܳ�Ϊ��"+o1.getPerimeter()+"���Ϊ��"+o1.getArea());
		System.out.println("�ڶ����˱���o2����o1���������ı߳�Ϊ��"+o2.getSide()+"�ܳ�Ϊ��"+o2.getPerimeter()+"���Ϊ��"+o2.getArea());
		System.out.println("���ǵıȽϽ��Ϊ�����Ϊ0��<Ϊ-1��>Ϊ1��:  "+o1.compareTo(o2));
	}

}
