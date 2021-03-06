package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class ListIteratorApplication
{
	ArrayList<String> sentence = new ArrayList<String>();
	
	public ListIteratorApplication(String input)
	{
		snipString(input);
		
		/* this would be needed without the snipString() method
		sentence.add("With");
		sentence.add("the"); 
		sentence.add("ListIterator");
		sentence.add("it");
		sentence.add("is");
		sentence.add("possible");
		sentence.add("to");
		sentence.add("travers");
		sentence.add("Lists");
		sentence.add("back");
		sentence.add("and");
		sentence.add("forth");	
		*/
	}
	
	public void iterateDown(){
		Iterator<String> it = sentence.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println("");
	}
	
	public void iterateUp(){
		Iterator<String> it = sentence.iterator();
		for(int i = sentence.size(); i > 0; i--){
			System.out.print(sentence.get(i-1) + " ");
		}
		System.out.println("");
	}
	
	public void iterateBothWays(){
		ListIterator<String> it = sentence.listIterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println("");
		
		while(it.hasPrevious()){
			System.out.print(it.previous() + " ");
		}
		System.out.println("");
	}
	
	public void snipString(String input){
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreElements()){
			sentence.add(st.nextToken());
		}
	}
}