package faculty;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(fac(6));
	}
	
	public static int fac(int n)
	{
		if(n <=1){
			return 1;
		}
		else{
			return (n*fac(n-1));
		}
	}
}