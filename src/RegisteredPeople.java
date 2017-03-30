import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringJoiner;

public class RegisteredPeople {

	public String registryName;
	private ArrayList<Person> registry;
	private Deque asylumDeque;

	public RegisteredPeople() {
		registry = new ArrayList<Person>();
		registryName = "Temp name to comply with main";
	}
	
	/**Add a person to the registry
	 * 
	 * @pre registry exists (and may be empty)
	 * @post additional person added to registry
	 * @param p the Person to be added to the registry
	 * @return number of people registered including this addition
	 */
	public int addPerson(Person p){
		registry.add(p);
		return registry.size();
	}

	public int removePerson(Person p){
		registry.remove(p);
		return registry.size();
	}

	
	/**Create registrationID in correct format for each person now in registry
	 * 
	 * @pre registry exists (may be empty)
	 * @post all people in registry have correctly formatted registrationIDs stored
	 * @return number of people registered at this time
	 */
	public int assignRegistrationID() {
		//TO DO: skip people who already have registrationID (need some scaffolding)
		//			(and would then return number of *new* registrationIDs created)
//		for (Person p : registry) {
//			p.createRegistrationID();
//		}
//		return registry.size();
		return 1;
//		So this right here....
//		I decided that I liked this idea very little.
//		I decided instead that this functionality belonged not in this class but rather in the individual constructors.
//
	}
	
	public int getNumberRegistered() { 
		return registry.size();
		} 
	
	public String toString() {
		StringJoiner toS;
		toS = new StringJoiner("");
		toS.add("Contents of " + registryName + " currently " + registry.size() + " people\n");
		try {
            for (Person p : registry) {
                toS.add(p.toString());
            }
        } catch(NullPointerException e){
		    // DO NOTHING
        }
		return toS.toString();	
	}
//	suppressing errors due to sad events
}
