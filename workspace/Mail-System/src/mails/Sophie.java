package mails;

public class Sophie
{
	public static void main(String[] args)
	{
		// create a MailServer
		MailServer MS1 = new MailServer();
		
		// create two clients
		MailClient sophie = new MailClient(MS1, "Sophie");
		MailClient juan = new MailClient(MS1, "Juan");
		
		// send a message from sophie to juan
		sophie.sendMailItem("Juan", "Hello Juan. How are you?");	
		
		// print the message at juans client
		juan.printNextMailItem();
		
		// check for new messages
		juan.printNextMailItem();
	}
}