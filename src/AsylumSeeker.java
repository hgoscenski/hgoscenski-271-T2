
public class AsylumSeeker extends Person {

    private String arrivalCountry;
    private boolean hasMedicalCondition;
    private String medicalCondtion;
    private int yearOfEntry;
    private String birthCountry;
    private AsylumProcessor as;

    public AsylumSeeker(String gNS, String fN, int yE, String arrivalCountry, String birthCountry, AsylumProcessor aP) {
        this.arrivalCountry = arrivalCountry;
        birthContryStatus(birthCountry);
        this.birthCountry = birthCountry;
        this.familyName = fN;
        this.givenNames = gNS;
        this.yearOfEntry = yE;
        registrationID = createRegistrationID();
        aP.addRear(this);
    }

    public AsylumSeeker(String gNS, String fN, int yE, String arrivalCountry, String birthCountry, String medicalCondition, AsylumProcessor aP){
        this.arrivalCountry = arrivalCountry;
        medStatus(medicalCondition);
        this.medicalCondtion = medicalCondition;
        birthContryStatus(birthCountry);
        this.familyName = fN;
        this.givenNames = gNS;
        this.yearOfEntry = yE;
        registrationID = createRegistrationID();
        if(hasMedicalCondition){
            aP.addFront(this);
        } else {
            aP.addRear(this);
        }
    }

    public String getGivenNames(){
        return givenNames;
    }

    public String getFamilyName(){
        return familyName;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    private void medStatus(String medicalCondtion){
        if(medicalCondtion.isEmpty()){
            hasMedicalCondition = false;
        } else {
            hasMedicalCondition = true;
        }
    }

    private void birthContryStatus(String birthCountry){
        if(birthCountry.isEmpty()){
            this.birthCountry = "Unknown";
        } else {
            this.birthCountry = birthCountry;
        }
    }

    public String getIDNum(){
        return registrationID.substring(registrationID.length()-5, registrationID.length()-1);
    }

    @Override
    public String createRegistrationID() {
        registrationID = "ASY*" + arrivalCountry+ "*" + yearOfEntry + "*-*" + nextNumber + "*";
        nextNumber++;
        return registrationID;
    }

    //To do: all that is needed here

}
