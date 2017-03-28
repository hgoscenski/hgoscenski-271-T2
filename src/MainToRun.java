
public class MainToRun {
/**Starting point for your work
 * It will not compile until you complete necessary work in other classes
 * DO NOT CHANGE this code to get it to compile!
 * 
 * @param args
 */
	public static void main(String[] args) {
		RegisteredPeople r;
		r = new RegisteredPeople();
		AsylumProcessor a;
		a = new AsylumProcessor("ExamTWOAsylumProcessor");
		
		r.addPerson(new Citizen("William Leonard", "Honig", 1984));
		r.addPerson(new Immigrant("Jacob", "Honig", 1918, "Germany" ));
		r.addPerson(new Citizen("Richard", "Smith", 2001));
		r.addPerson(new AsylumSeeker("Rose Rachel", "Korn", 1949, "Germany", "India", a));
		r.addPerson(new AsylumSeeker("George William", "Jones", 1929, "Greece", "Syria", a));
		r.addPerson(new AsylumSeeker("Jane Susan Grace", "Smith", 2000, "UK", "Kosovo", "Land mine rehabilitation", a));		
		r.addPerson(new Citizen("Allison Louise", "Adams", 1998));
		r.addPerson(new Immigrant("Mamie", "Liu", 1993, "People's Republic of China" ));
		r.addPerson(new AsylumSeeker("Peter", "Liu", 1995, "Canada", "People's Republic of China", a));
		r.addPerson(new AsylumSeeker("Jane", "Doe", 1899, "Germany", "", "Heart Transplant", a));
		
		r.assignRegistrationID();
		System.out.println(r);
		
		System.out.println("\nAccept 3 asylum applicants.");
		a.acceptSeekers(3, r);
		System.out.println(r);
		
		myOwnAddedTests();	
	}
	
	public static void myOwnAddedTests() {
		//Optionally add more testing you wish to do here
		//DO NOT CHANGE anything in main above; I will use an extension of this code to test your program
		return;
	}

}
