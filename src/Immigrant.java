public class Immigrant extends Person {
	
	private int yearOfEntry;
	private String birthCountry;
	
	public Immigrant(String gNs, String fN, int yE, String bC) {
		givenNames = gNs;
		familyName = fN;
		yearOfEntry = yE;
		birthCountry = bC;	
	}
	
	public Immigrant(AsylumSeeker s){
		givenNames = s.getGivenNames();
		familyName = s.getFamilyName();
		yearOfEntry = s.getYearOfEntry();

		//Suggestion - add this constructor to make an immigrant from a asylum seeker
	}
	
	/**Implement abstract Person method to create immigrant registrationID in proper form
	 * 
	 */
	@Override
	public String createRegistrationID() {
		registrationID = "IM" + birthCountry + yearOfEntry + "-" + nextNumber;
		nextNumber++;
		return registrationID;
	}



//			registrationID.substring(registrationID.length()-4, registrationID.length()).matches("[\\d]{4}")


}