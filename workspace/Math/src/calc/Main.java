package calc;

public class Main
{
	public static void main(String[] args)
	{
		int i = 3;
		double d = 3.0;
		boolean isFull = true;
		boolean isHot = false;
		
		System.out.println( 10 / i + 2);
		System.out.println( 10 / d + 2 );
		System.out.println( 7 / i + 1.0f );
		System.out.println( 7 / (i + 1.0));
		System.out.println( 10 / (d + 1));
		System.out.println( 7 + i * d );
		System.out.println( 14 % i );
		System.out.println( 4 * (i + d) / 8 );
		System.out.println( isFull ^ isHot );
		System.out.println( isFull && isHot );
		System.out.println( (i >= 2) && isFull );
		System.out.println( ((100-95)<=5) || ((95-100)>=5) );
	}
}