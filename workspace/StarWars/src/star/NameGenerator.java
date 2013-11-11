package star;

public class NameGenerator
{
	
	public NameGenerator()
	{
		
	}
	
	/**
	 * This method returns a name that is created by the
	 * Star Wars algorithm.
	 * @param yourLastName
	 * @param yourFirstName
	 * @param yourMothersMaidenName
	 * @param yourHomeTownName
	 * @return
	 */
	public String generateStarWarsName(	String yourLastName, 
										String yourFirstName, 
										String yourMothersMaidenName, 
										String yourHomeTownName)
	{
		String newFirstName;
		String newLastName;
		
		/**
		 * The new first name is built by the first three letters
		 * of the last name and the first two letters of the 
		 * first name.
		 */
		newFirstName = yourLastName.substring(0,3) + 
				yourFirstName.substring(0,2);
		
		/**
		 * The new last name is built by the first two letters of 
		 * the mothers maiden name and the first three letters of
		 * the home town.
		 */
		newLastName = yourMothersMaidenName.substring(0, 2) + 
				yourHomeTownName.substring(0,3);
		
		/**
		 * Return the new names as full name (first and last name)
		 * separated by a whitespace.
		 */
		return newFirstName + " " + newLastName;
	}
	
}