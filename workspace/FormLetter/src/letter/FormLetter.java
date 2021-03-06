package letter;

import java.util.ArrayList;

public class FormLetter
{
	private ArrayList<FormalAddress> fa = new ArrayList<>();
	
	public FormLetter(){
		
	}
	
	public void addAddress(	String firstname, 
							String lastname,
							String address,
							String city)
	{
		FormalAddress newAdress = new FormalAddress(firstname, 
													lastname,
													address,
													city);
		fa.add(newAdress);
	}
	
	void print(int actualYear, String subject, String textBody)
	{
		for(FormalAddress a : fa){
			System.out.println("====================");
			System.out.println(a.getName());
			System.out.println(a.getAddress());
			System.out.println(a.getCity());
			System.out.println("");
			System.out.println(subject);
			System.out.println("");
			System.out.println("Dear" + a.getName() + ",");
			System.out.println(textBody);
			System.out.println("");
			System.out.println("====================");
		}
			
	}
}