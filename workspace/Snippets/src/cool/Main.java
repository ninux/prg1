package cool;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(coolMehtod(4));
	}
	
	public static int coolMehtod(int n)
	{
		if(n >= 2){
			return (coolMehtod(n-1) + coolMehtod(n-2));
		}
		else{
			return n;
		}
	}
}