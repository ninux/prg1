package flight;

/**
 * Balloon models a simple abstraction of a physical balloon.
 */

public class Balloon
{
	// size of the balloon. The balloon is abstracted a perfect
	// bowl defined by its diameter. 
	private float diameter;
	
	// horizontal position of the balloon
	private int posHorizontal;
	
	// altitude (vertical position) of the balloon
	private int posVertical;
	
	// color of the balloon
	private String color;
	
	// number of the ballon
	private int number;
	
	// simple constructor
	public Balloon()
	{
		diameter = 300f;
		posHorizontal = 300;
		posVertical = 300;
		color = "red";
	}
	
	// more detailed constructor
	public Balloon(String newColor)
	{
		color = newColor;
	}
	
	public void setPosition(int newHorizontal, int newVertical)
	{
		posHorizontal = newHorizontal;
		posVertical = newVertical;
	}
	
	public void setDiameter(float newDiameter)
	{
		diameter = newDiameter;
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public void setNumber(int newNumber)
	{
		number = newNumber;
	}
	
	public int getHorizontal()
	{
		return posHorizontal;
	}
	
	public int getVertical()
	{
		return posVertical;
	}
	
	public float getDiameter()
	{
		return diameter;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getNumber()
	{
		return number;
	}
}


