package second_package;
import first_package.*;

public class PathLabTest extends LabTest{

    public PathLabTest(String patientId, int price) {
        super(patientId);
        this.price = price;
        this.ID = LAB4B.getPathlab().createTEST();  //gets ID from the LAB
    }

    public void generateResult(String result){
        this.result = result;
    }
}
