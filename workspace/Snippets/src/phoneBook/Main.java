package phoneBook;

public class Main
{
	public static void main(String[] args)
	{
		// create a new phoneBook
		MapTester myContacts = new MapTester();
		
		// add some entries
		myContacts.enterNumber("Richard Stallman", "1234567890");
		myContacts.enterNumber("Donald Ervin Knuth", "1123581321");
		
		// lookup for the numbers
		System.out.println(myContacts.lookupNumber("Richard Stallman"));
		System.out.println(myContacts.lookupNumber("Donald Ervin Knuth"));
		
		if(myContacts.checkForKey("Richard Stallman")){
			System.out.println("Yep, he's in your phonebook!");
		} else{
			System.out.println("Nope, he's not in your phonebook!");
		}
	}
	
}