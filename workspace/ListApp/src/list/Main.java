package list;

public class Main
{
	public static void main(String[] args)
	{
		final String input = "With the ListIterator it is possible to "
				+ "travers Lists back and forth";
		
		ListIteratorApplication lia = new ListIteratorApplication(input);
		
		lia.iterateDown();
		lia.iterateUp();
		lia.iterateBothWays();
	}
}