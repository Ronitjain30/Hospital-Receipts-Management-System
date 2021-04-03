package second_package;
import first_package.*;

public class BioChemTest extends LabTest {

    public BioChemTest(String patientId, int price) {
        super(patientId);
        this.price = price;
        this.ID = LAB4B.getBiochemlab().createTEST();    //gets ID from the LAB
    }

    public void generateResult(String result){
        this.result = result;
    }

}
