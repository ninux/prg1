package flight;

public class Main
{
	public static void main(String[] args)
	{
		// create a new balloon (with the simple constructor)
		Balloon b1 = new Balloon();
		// get the current horizontal position
		System.out.println("Horizontal: " + b1.getHorizontal());
		// set a new horizontal position
		b1.setPosition(400, 400);
		// get the current horizontal position
		System.out.println("Horizontal: " + b1.getHorizontal());
		
		// create a new ballon with the detailed constructor
		Balloon b2 = new Balloon("yellow");
		// get the color of the new ballon
		System.out.println("Color: " + b2.getColor());;
	}
}


