package multiply;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		int product = 0;
		int factor1 = 0;
		int factor2 = 0;
		
		// create a Random instance
		Random rand = new Random();
		Multiplier multi = new Multiplier();
		
		
		// do a multiplication
		factor1 = rand.nextInt(10);
		factor2 = rand.nextInt(10);
		product = multi.multiply(factor1, factor2);
		System.out.println(factor1 + " times " + factor2 + " = " + product);
	}
}