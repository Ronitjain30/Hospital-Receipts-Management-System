package first_package;
import second_package.*;


public class Reception {

    private int id = 1;  //id's are sequential integers starting at 1 each day
    private int PathTestPrice = 1000;   //defining costs of the tests
    private int BioChemTestPrice = 400;

    boolean addRequest (String testType){

        if ( testType.equals("Bio") ) {

            //converting the id into string
            String ID = Integer.toString(id);

            // should create the appropriate sub-type of LabTest
            BioChemTest bct = new BioChemTest(ID, BioChemTestPrice);
            // add that to Billing
            LAB4B.getBilling().billTest(bct);
            // then to the specific lab, after generating a patient ID
            LAB4B.getBiochemlab().addTest(bct);

            id++;
            return true;
        }

        else if ( testType.equals("Path") ) {

            //converting the id into string
            String ID = Integer.toString(id);

            // should create the appropriate sub-type of LabTest
            PathLabTest pt = new PathLabTest(ID, PathTestPrice);
            // add that to Billing
            LAB4B.getBilling().billTest(pt);
            // then to the specific lab, after generating a patient ID
            LAB4B.getPathlab().addTest(pt);

            id++;
            return true;
        }
        return false;
    }

}
