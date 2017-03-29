
public class AsylumSeeker extends Person {

    private String arrivalCountry;
    private boolean hasMedicalCondition;
    private String medicalCondtion;
    private int yearOfEntry;
    private String birthCountry;
    private AsylumProcessor as;

    public AsylumSeeker(String gNS, String fN, int yE, String arrivalCountry, String birthCountry, AsylumProcessor aS) {
        this.arrivalCountry = arrivalCountry;
        if(birthCountry.isEmpty()){
            this.birthCountry = "Unknown";
        } else {
            this.birthCountry = birthCountry;
        }
        this.birthCountry = birthCountry;
        this.familyName = fN;
        this.givenNames = gNS;
        this.yearOfEntry = yE;
        this.as = as;
    }

    public AsylumSeeker(String gNS, String fN, int yE, String arrivalCountry, String birthCountry, String medicalCondition, AsylumProcessor aS){
        this.arrivalCountry = arrivalCountry;
        if(medicalCondition.isEmpty()){
            hasMedicalCondition = false;
        } else {
            hasMedicalCondition = true;
        }
        this.medicalCondtion = medicalCondition;
        this.birthCountry = birthCountry;
        this.familyName = fN;
        this.givenNames = gNS;
        this.yearOfEntry = yE;
        this.as = as;

    }

    public String getGivenNames(){
        return givenNames;
    }

    public String getFamilyName(){
        return familyName;
    }

    public String getArrivalCountry() {
        return arrivalCountry;
    }

    public boolean isHasMedicalCondition() {
        return hasMedicalCondition;
    }

    public String getMedicalCondtion() {
        return medicalCondtion;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    @Override
    public String createRegistrationID() {
        registrationID = "ASY*" + arrivalCountry+ "*" + yearOfEntry + "*-*" + nextNumber + "*";
        nextNumber++;
        return registrationID;
    }

    //To do: all that is needed here

}
