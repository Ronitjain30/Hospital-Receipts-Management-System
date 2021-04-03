package second_package;
import first_package.*;

public class BioChemLab extends Lab {

    private int id = 1;
    private int result = 100;

    public String createTEST(){
        String ID = "B";    //creating the test ID
        ID = ID + id;
        return ID;
    }

    public void addTest(BioChemTest test) {
        // generates testId, the report,
        test.generateResult(Integer.toString(result));
        result++;
        Tests.add(test);

        // and then sends it to Dispatch using processReport
        LAB4B.getDispatch().processReport(test);
        id++;
    }

}
