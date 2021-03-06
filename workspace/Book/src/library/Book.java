package library;

public class Book
{
	// title of the book
	private String title;
	
	// author of the book
	private String author;
	
	// price of the book
	private float price;
	
	// year of buy
	private int year;
	
	/**
	 * Create a new book with all attributes.
	 */
	public Book(String newTitle, String newAuthor, float newPrice, int newYear)
	{
		title = newTitle;
		author = newAuthor;
		price = newPrice;
		year = newYear;
	}
	
	public Book(String newTitle, String newAuthor)
	{
		title = newTitle;
		author = newAuthor;
		price = 0.0f;
		year = -1;
	}
	
	public String getTitle()
	{
		System.out.println("Title: " + title);
		return title;
	}
	
	public String getAuthor()
	{
		System.out.println("Author: " + author);
		return author;
	}
	
	public void setYear(int newYear)
	{
		year = newYear;
	}
	
	public void setPrice(float newPrice)
	{
		price = newPrice;
	}
	
	public int getYear()
	{
		System.out.println("Year: " + year);
		return year;
	}
	
	public float getPrice()
	{
		System.out.println("Price: " + price + " USD");
		return price;
	}
	
}