package euklid;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		// create two random numbers
		Random rand = new Random();
		int range = 20;
		int num1 = rand.nextInt(range) + 1;
		int num2 = rand.nextInt(range) + 1;
		
		// get the greatest common divisor
		System.out.println( "GCD of " 
							+ num1 
							+ " and " 
							+ num2 
							+ " is " 
							+ gcd(num1,num2));
	}

	public static int gcd(int a, int b)
	{
		while((a != 0) && (b != 0)){
			if(a > b){
				a = a % b;
			}
			else{
				b = b % a;
			}
		}
		return (a + b); 
	}
}