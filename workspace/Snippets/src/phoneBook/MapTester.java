package phoneBook;

import java.util.HashMap;

public class MapTester
{
	private HashMap<String, String> myMap = new HashMap<String, String>();
	
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
	
	public boolean checkForKey(String key)
	{
		return myMap.containsKey(key);
	}
}