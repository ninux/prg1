package calc;

public class Main
{
	public static void main(String[] args)
	{
		int value = 20;
		int limit = 22;
		
		while(true)
		{
			if((value+1) < limit)
				value++;
			else
				value = 0;
		}
	}
}