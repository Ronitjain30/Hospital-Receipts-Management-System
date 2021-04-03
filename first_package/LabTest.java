package first_package;

public class LabTest {

    protected String patientId;
    protected int price;
    protected String result;
    protected String ID;

    public LabTest(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId(){ return patientId; }
    public int getPrice(){ return price; }
    public String getResult(){ return result; }
    public String getId(){ return ID; }

}
