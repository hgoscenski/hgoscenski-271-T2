import java.util.ArrayDeque;
import java.util.Deque;

public class AsylumProcessor {

	private String processorName;
	private ArrayDeque<AsylumSeeker> registryDeque;

	public AsylumProcessor(String processorName){
		this.processorName = processorName;
		this.registryDeque = new ArrayDeque();
	}

	public String toString(){
		StringBuilder tos = new StringBuilder();
		for (AsylumSeeker as:registryDeque) {
			tos.append(as.toString());
		}
		return tos.toString();
	}

	public void addFront(AsylumSeeker as){
	    registryDeque.addFirst(as);
	}

	public void addRear(AsylumSeeker as){
	    registryDeque.addLast(as);
    }

    public int acceptSeekers(int numAccepted, RegisteredPeople rp){
		try {
			if (numAccepted > registryDeque.size()) {
				throw new AcceptedAsylumSeekersGreaterThanNumberOfAsylumSeekersException("No changes performed.");
			}
//			this is an exception telling you that you shouldnt have done what you did, it also tells you no changes were made.
		} catch(AcceptedAsylumSeekersGreaterThanNumberOfAsylumSeekersException e){
			e.printStackTrace();
			System.out.println(e + " | *****************");
			return 0;
		}
	    int counter = 0;
	    for(int i = 0; i < numAccepted; i++){
			AsylumSeeker tempAsy = registryDeque.pop();
			rp.removePerson(tempAsy);
	        rp.addPerson(new Immigrant(tempAsy));
	        counter++;
        }
        return counter;
    }

}
