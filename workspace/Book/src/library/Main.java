package library;

public class Main
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Objects First with Java", "David Barnes", 70.0f, 2013);
		b1.getTitle();
		b1.getAuthor();
		b1.getYear();
		b1.getPrice();
	}
}
