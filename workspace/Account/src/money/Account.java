package money;

public class Account
{
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerAddress;
	private String ownerEMail;
	private int yearOfBirth;
	private int yearOfAccount;
	private int accountNumber;
	private long accountBalance;
	private long accountDebit;
	private long accountCredit;
	private boolean accountActive;
	
	/**
	 * Create a new inactive account with default values.
	 */
	public Account()
	{
		ownerFirstName = "Default";
		ownerLastName = "Default";
		ownerAddress = "Default";
		ownerEMail = "Deafult";
		yearOfBirth = -1;
		yearOfAccount = -1;
		accountNumber = -1;
		accountBalance = 0;
		accountDebit = 0;
		accountCredit = 0;
		accountActive = false;
	}
	
	/**
	 * Create a new active account.
	 */
	
	public Account(	String newFirstName,
					String newLastName,
					String newAddress,
					String newEMail,
					int newYearOfBirth,
					int newYearOfAccount,
					int newAccountNumber,
					long newAccountBalance)
	{
		ownerFirstName = newFirstName;
		ownerLastName = newLastName;
		ownerAddress = newAddress;
		ownerEMail = newEMail;
		yearOfBirth = newYearOfBirth;
		yearOfAccount = newYearOfAccount;
		accountNumber = newAccountNumber;
		accountBalance = newAccountBalance;
		accountDebit = 0;
		accountCredit = 0;
		accountActive = true;
	}
	
	public String getOwnerFirstName()
	{
		System.out.println("First name: " + ownerFirstName);
		return ownerFirstName;
	}
	
	public void setOwnerFirstName(String newOwnerFirstName)
	{
		ownerFirstName = newOwnerFirstName;
	}
}