public class Immigrant extends Person {
	
	private int yearOfEntry;
	private String birthCountry;
	
	public Immigrant(String gNs, String fN, int yE, String bC) {
		givenNames = gNs;
		familyName = fN;
		yearOfEntry = yE;
		birthCountry = bC;
		registrationID = createRegistrationID();
	}

//	added this here fancy constructor to turn asylumseekers into immigrants
	
	public Immigrant(AsylumSeeker s){
		givenNames = s.getGivenNames();
		familyName = s.getFamilyName();
		yearOfEntry = s.getYearOfEntry();
		birthCountry = s.getBirthCountry();
		createRegistrationId(s);
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

//	made a fancy OO method that can take the asylum seeker and retain there reg number using a method that takes it as a substring from their orginal id

	public String createRegistrationId(AsylumSeeker as){
		registrationID = "IM" + birthCountry + yearOfEntry + "-" + as.getIDNum();
		nextNumber++;
		return registrationID;
	}



//			registrationID.substring(registrationID.length()-4, registrationID.length()).matches("[\\d]{4}")


}