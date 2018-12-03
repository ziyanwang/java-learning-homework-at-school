package project6;

public class TestSquare {
	public static void main(String[] args)
	{
		Square g[]=new Square[5]; 
		g[0]=new Square();
		g[1]=new Square(3.0);
		g[2]=new Square(2.0,"Red",false);
		g[3]=new Square(1.5,"Yellow",true);
		g[4]=new Square(3.5,"Blue",true);
		g[0].howToColor();
		g[1].howToColor();
		g[2].howToColor();
		g[3].howToColor();
		g[4].howToColor();
	}
}
