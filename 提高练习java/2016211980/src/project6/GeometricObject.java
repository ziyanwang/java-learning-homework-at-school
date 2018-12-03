package project6;

public class GeometricObject {
	private String color="White";
	private boolean filled;
	private java.util.Date date;
	public GeometricObject()
	{
		date=new java.util.Date();
	}
	public GeometricObject(String color,boolean filled)
	{
		date=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
    public String getColor()
    {
    	return color;
    }
    public void setColor(String color)
    {
    	this.color=color;
    }
    public boolean isFilled()
    {
    	return filled;
    }
    public void setFilled(boolean filled)
    {
    	this.filled=filled;
    }
    public java.util.Date getDateCreat()
    {
    	return date;
    }
    public String toString()
    {
    	return "created on "+date+"\ncolor:"+color+" and filled: "+filled;
    }
}
