package foobar;

public class Main
{
	public static void main(String[] args)
	{
		TicketMachine tm1;
		tm1 = new TicketMachine(300);
		
		tm1.insertMoney(200);
		
		System.out.println("Balance: "+tm1.getBalance());
		
		tm1.insertMoney(100);
		
		tm1.printTicket();
	}
}