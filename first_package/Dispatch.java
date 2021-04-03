package first_package;

import java.util.*;

public class Dispatch {

    private ArrayList<String> Tests = new ArrayList<>();  //array list of all the tests

    public void processReport(LabTest test){
        String R = "";  //R is an empty report in string form
        R = R + test.getPatientId() + " " + test.getId() + " " + test.getResult();

        Tests.add(R);
    }
    public ArrayList<String> getAllResults(){ return Tests; }
}
