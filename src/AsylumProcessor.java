import java.util.ArrayDeque;
import java.util.Deque;

public class AsylumProcessor {

	private String processorName;
	private ArrayDeque<AsylumSeeker> registryDeque;

	public AsylumProcessor(String processorName){
		this.processorName = processorName;
		this.registryDeque = new ArrayDeque();
	}

	public void addFront(AsylumSeeker as){
	    registryDeque.addFirst(as);
	}

	public void addRear(AsylumSeeker as){
	    registryDeque.addLast(as);
    }

    public int acceptSeekers(int i, RegisteredPeople rp){
	    int counter = 0;
	    for(int j = 0; j < registryDeque.size(); j++){
			AsylumSeeker tempAsy = registryDeque.pop();
			rp.removePerson(tempAsy);
	        rp.addPerson(new Immigrant(tempAsy));
	        counter++;
        }
        return counter;
    }

}
