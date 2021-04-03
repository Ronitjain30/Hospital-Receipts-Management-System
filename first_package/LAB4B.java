package first_package;
// import second.BioChemLab;
// import second.PathLab;
import second_package.*;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB4B{

    static PathLab pathlab;
    static BioChemLab biochemlab;
    static Dispatch dispatch;
    static Billing billing;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
        Reception reception = new Reception();
        billing = new Billing();
        dispatch = new Dispatch();
        biochemlab = new BioChemLab();
        pathlab = new PathLab();

        // read in the input for test requests, and send to Reception (addRequest)
        int number = sc.nextInt();

        for (int i=0; i<number; i++){

            //which kind of test is chosen
            String testType = sc.next();

            //adding request in the reception
            reception.addRequest(testType);
        }

        System.out.println();



        // get all bills from Billing and print out the total for the day
        ArrayList<String> allBills = billing.getBills();

        int temp = 0;

        for (String str : allBills){
            String[] total_money = str.split(" ",2);

            //gives the total money which is required
            temp = temp + Integer.parseInt(total_money[1]);
        }

        //printing out the total money
        System.out.println("Total billed: " + temp);

        //printing out the reports
        System.out.println("Reports: ");

        // get all reports from Dispatch and print out one line at a time
        ArrayList<String> allReports = dispatch.getAllResults();
        for (String str : allReports){
            System.out.println(str);  //printing all of the reports
        }
        // get list of tests from each lab, and print out total tests per lab
        System.out.println("Total Tests: ");  //printing total number of tests
        System.out.println("BioChem: " + biochemlab.getTests().size());   //printing all bioChemLab tests
        System.out.println("Path: " + pathlab.getTests().size());   //printing all pathLab tests

        sc.close();
    }

    public static PathLab getPathlab() {
        return pathlab;
    }
    public static BioChemLab getBiochemlab() {
        return biochemlab;
    }
    public static Dispatch getDispatch() {
        return dispatch;
    }
    public static Billing getBilling() {
        return billing;
    }
}
