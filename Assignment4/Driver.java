package JavaAssignments.Assignment4;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        KYC kyc=new KYC();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of dates");

        int numOfInput=scanner.nextInt();
        String[] signUpDates=new String[numOfInput];
        String[] currDate=new String[numOfInput];

        for(int i=0;i<=numOfInput;i++) {
            signUpDates[i]=scanner.next();
            currDate[i]=scanner.next();
            kyc.findRange(signUpDates[i],currDate[i]);
        }
    }
}
