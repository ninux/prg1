package phoneBook;

import java.util.HashMap;

public class MapTester
{
	HashMap<String, String> myMap = new HashMap<String, String>();
	
	public MapTester()
	{
		
	}
	
	public void enterNumber(String name, String number)
	{
		myMap.put(name, number);
	}
	
	public String lookupNumber(String name)
	{
		return myMap.get(name);
	}
}