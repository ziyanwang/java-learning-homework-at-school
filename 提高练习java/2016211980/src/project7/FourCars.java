package project7;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FourCars extends JFrame{
	Timer t1=new Timer(1000,new TimerListener(1));
	Timer t2=new Timer(1000,new TimerListener(2));
	Timer t3=new Timer(1000,new TimerListener(3));
	Timer t4=new Timer(1000,new TimerListener(4));
	Car car1=new Car();
	Car car2=new Car();
	Car car3=new Car();
	Car car4=new Car();
	public FourCars()
	{
		//第一部分，先画出上面的文字输入部分，用p1完成
		JPanel p1=new JPanel(new GridLayout(1,0));
		p1.add(new JLabel("Car1:"));
		JTextField jtf1=new JTextField(); 
		p1.add(jtf1);
		p1.add(new JLabel("Car2:"));
		JTextField jtf2=new JTextField();
		p1.add(jtf2);
		p1.add(new JLabel("Car3:"));
		JTextField jtf3=new JTextField();
		p1.add(jtf3);
		p1.add(new JLabel("Car3:"));
		JTextField jtf4=new JTextField();
		p1.add(jtf4);
		jtf1.addActionListener(new CarTimeListener(1));
		jtf2.addActionListener(new CarTimeListener(2));
		jtf3.addActionListener(new CarTimeListener(3));
		jtf4.addActionListener(new CarTimeListener(4));
		add(p1,BorderLayout.NORTH);
		//第二部分，准备画小车
		JPanel p2=new JPanel(new GridLayout(4,1));
		
		p2.add(car1);
		p2.add(car2);
		p2.add(car3);
		p2.add(car4);
		add(p2,BorderLayout.CENTER);
		
	}
	
	class CarTimeListener implements ActionListener
	{
		int whichCar=0;
		CarTimeListener(int a)
		{
			whichCar=a;
		}
		public void actionPerformed(ActionEvent e)
		{
			int v=Integer.parseInt(e.getActionCommand());
			if(whichCar==1)
			{
				t1.setDelay(1000/v);
				t1.start();
			}
			else if(whichCar==2)
			{
				t2.setDelay(1000/v);
				t2.start();
			}
			else if(whichCar==3)
			{
				t3.setDelay(1000/v);
				t3.start();
			}
			else if(whichCar==4)
			{
				t4.setDelay(1000/v);
				t4.start();
			}
		}
	}
	class TimerListener implements ActionListener
	{
		int whichCar=0;
		TimerListener(int a)
		{
			whichCar=a;
		}
		public void actionPerformed(ActionEvent e)
		{
			
		if(whichCar==1)
		{
			car1.repaint();
		}
		else if(whichCar==2)
		{
			car2.repaint();
		}
		else if(whichCar==3)
		{
			car3.repaint();
		}
		else if(whichCar==4)
		{
			car4.repaint();
		}
		}
	}
	public static void main(String[] args)
	{
		FourCars frame=new FourCars();
		frame.setSize(500,300);
		frame.setTitle("Four cars");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	class Car extends JPanel{ 
		int dis=0;
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawLine(0, 0,getWidth(), 0);
			g.drawLine(0, getHeight(),getWidth(), getHeight());
			if(dis>500)
				dis=0;
			else
				dis=dis+1;
			g.setColor(Color.BLUE);
			g.fillRect(dis,25, 40, 20);
			g.setColor(Color.BLACK);
			g.fillOval(dis+5, 45, 10, 10);
			g.fillOval(dis+25, 45, 10, 10);
		}
	}
}
