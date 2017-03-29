
public class Citizen extends Person {

	private int yearOfBirth;
	
	public Citizen(String gNs, String fN, int yB){
		givenNames = gNs;
		familyName = fN;
		yearOfBirth = yB;
		registrationID = createRegistrationID();
	}
	/**Implement abstract Person method to create citizen registrationID in proper form
	 * 
	 */
	@Override
	public String createRegistrationID() {
		registrationID = "USA" + yearOfBirth + "-" + nextNumber;
		nextNumber++;
		return registrationID;
	}

}
