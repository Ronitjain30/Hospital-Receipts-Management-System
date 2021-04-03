package second_package;
import first_package.*;

public class PathLab extends Lab {

    private int id = 1;
    private String r1 = "benign";
    private String r2 = "malignant";

    public String createTEST(){
        String ID = "P";    //creating the test ID
        ID = ID + id;
        return ID;
    }

    public void addTest(PathLabTest test) {
        // generates testId, the report,
        if ( id%3 == 0) {
            test.generateResult(r2);
        }
        else {test.generateResult(r1); }
        Tests.add(test);

        // and then sends it to Dispatch using processReport
        LAB4B.getDispatch().processReport(test);
        id++;
    }
}
