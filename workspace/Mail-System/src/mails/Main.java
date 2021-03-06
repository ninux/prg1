package mails;

public class Main
{
	public static void main(String[] args)
	{
		// create a MailServer
		MailServer MS1 = new MailServer();
		
		// create two MailClients
		MailClient MC1 = new MailClient(MS1, "Homer");
		MailClient MC2 = new MailClient(MS1, "Fry");
		
		// send a message from MC1 to MC2
		MC1.sendMailItem("Fry", "Hello Fry! How are you?");
		
		// show the mail at MC2
		MC2.printNextMailItem();
		
		// give an answer
		MC2.sendMailItem("Homer", "Hi Homer! I'm fine, thanks.");
		
		// show the mail at MC1
		MC1.printNextMailItem();
	}
}