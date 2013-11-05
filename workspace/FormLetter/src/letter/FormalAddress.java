package letter;

public class FormalAddress
{
	private String firstname = "Default";
	private String lastname = "Default";
	private String address = "Default";
	private String city = "Default";
	
	public FormalAddress(	String newFirstName,
							String newLastName,
							String newAddress,
							String newCity)
	{
		firstname = newFirstName;
		lastname = newLastName;
		address = newAddress;
		city = newCity;
	}
	
	public String getName(){
		return firstname + " " + lastname;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}
}