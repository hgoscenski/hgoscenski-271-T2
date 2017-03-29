
public abstract class Person {

	protected static int nextNumber = 9001; //starting point for unique registration numbers
	protected String givenNames;
	protected String familyName;
	protected String registrationID;
	
	/**Abstract method to ensure create appropriate registration ID in subclasses
	 * 
	 * @post newly created registration ID added to Person as data member
	 * @return the newly created and formatted registrationID 
	 */
	public abstract String createRegistrationID();
	
	/**toString() can be concrete method as distinguishing formatting done and stored in Person object
	 * 
	 */
	public String toString() {
		return registrationID + " *" + familyName.toUpperCase() + "*" + givenNames + "\n";
	}
	
	public int compareTo(Person p) {
		return registrationID.compareTo(p.registrationID);
	}
}
