package first_package;

import java.util.ArrayList;

public class Billing {

     private ArrayList<String> Bills = new ArrayList<>(); //array list that has all the bills

    public void billTest(LabTest test){

        String B = "";   //an empty bill in string form
        // each string has testId and billed amount, separated by a space
        B = B + test.getPatientId() + " " + test.getPrice();

        Bills.add(B);
    }   // called by Reception

    public ArrayList<String> getBills() { return Bills; }  // one string for each test
}
