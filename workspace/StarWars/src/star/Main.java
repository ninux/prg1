package star;

public class Main
{
	public static void main(String[] args)
	{
		NameGenerator ng = new NameGenerator();
		
		System.out.println(ng.generateStarWarsName("Nino", "Ninux", "Fooman", "Bartown"));
	}
}