package shop;

public class Main{
	public static void main(String[] args){
		// create a sales item
		SalesItem si1 = new SalesItem("Lolly", 300);
		SalesItem si2 = new SalesItem("Donut", 500);
		
		// add some more than 10 regular comments
		si1.addComment("Zuzu", "I like the taste very much", 5);
		si1.addComment("Fry", "kind of a hipster thing", 4);
		si1.addComment("Frank", "Not my color at all", 3);
		si1.addComment("Leela", "a real eyecatch", 5);
		si1.addComment("Hubert", "I dont like lolly-pops", 0);
		si1.addComment("Nibbler", "yummy", 5);
		si1.addComment("Bender", "why organic food at all", 1);
		si1.addComment("Homer", "hmmm...", 5);
		si1.addComment("Lisa", "not very healthy", 2);
		si1.addComment("Marge", "reminds me of my childhood", 5);
		si1.addComment("C. M. Burns", "I once invented them", 4);
		si1.addComment("Smithers", "could not live without", 5);
		
		// add a further comment on same person
		si1.addComment("Fry", "shut up and take my money!", 5);
		
		// show the comments
		si1.showInfo();
		
		// show most helpful comment for item without comments at all
		si2.findMostHelpfulComment();
	}
}