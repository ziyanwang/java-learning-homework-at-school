package firstlab;

import javax.swing.JOptionPane;

public class AMathLearningTool {
	public static void main(String[] args)
	{
		int number1=(int) (System.currentTimeMillis()%10);
		int number2=(int) (System.currentTimeMillis()/3%10);
		String input=JOptionPane.showInputDialog("What is "+number1+" + "+number2);
		try
		{
			int Ans=Integer.parseInt(input);
			int ans = number1+number2;
			boolean c=(ans == Ans)?true:false;
			while(c)
			{
				JOptionPane.showMessageDialog(null, number1+" + "+number2+" = "+Ans+" is true", "true", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			while(!c)
			{
				JOptionPane.showMessageDialog(null, number1+" + "+number2+" = "+Ans+" is wrong", "wrong", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "��̫��Ƥ�����������Ƿ��ַ�Ŷ", "������", JOptionPane.ERROR_MESSAGE);

		}
		
		//JOptionPane.showMessageDialog(null, "����", "����", JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "����", "����", JOptionPane.INFORMATION_MESSAGE);
	}
}