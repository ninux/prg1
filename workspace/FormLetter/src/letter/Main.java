package letter;

public class Main
{
	public static void main(String[] args)
	{
		FormLetter myLetter = new FormLetter();
		
		myLetter.addAddress("Richard", "Stallman", "Freeroad 91", "Freetown");
		myLetter.addAddress("Linus", "Torvalds", "Unixstreet 101", "Helsinki");
		myLetter.addAddress("Ervin", "Knuth", "Stanfordstreet 5", "Brooklyn");
		
		myLetter.print(2013, "New Kernel Realease", 
				"I'd like to inform you that there is a new Kernel release.");
	}
}