package randomResponse;

import java.util.ArrayList;
import java.util.Random;

public class RandomResponse
{
	public static void main(String[] args)
	{
		// create an ArrayList for String objects
		ArrayList<String> responses = new ArrayList<String>();
		
		// create an Random instance
		Random rand = new Random();
		int ans = 0;
		
		// add some responses to the ArrayList
		responses.add("Have you tried turning it off and on again?");
		responses.add("Are you sure you have the latest update installed?");
		responses.add("Maybe you should upgrade to platinum version.");
		responses.add("Have you tried a complete new setup?");
		responses.add("I'm on pause now, I'll be back in 5 minutes.");
		responses.add("I'm new to this company and I didn't see such a problem yet.");
		
		// give a random responses
		System.out.println(responses.get(rand.nextInt(responses.size())));
	}
}