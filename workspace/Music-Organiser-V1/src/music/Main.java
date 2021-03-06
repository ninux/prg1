package music;

public class Main
{
	public static void main(String[] args)
	{
		// create a MusicOrganiser object
		MusicOrganizer myOrg = new MusicOrganizer();
		
		// store some tracks to it
		myOrg.addFile("Free Software Song");
		myOrg.addFile("Hacker after all");
		myOrg.addFile("CRE197 - IPV6");
		
		// check the number of tracks that are stored
		System.out.println("Number of Files: " + 
							myOrg.getNumberOfFiles());
		
		// show the name of the first, second and third track
		myOrg.listFile(0);
		myOrg.listFile(1);
		myOrg.listFile(2);
		
		// remove the first track and ask for the first track
		myOrg.removeFile(0);
		myOrg.listFile(0);
	}
}