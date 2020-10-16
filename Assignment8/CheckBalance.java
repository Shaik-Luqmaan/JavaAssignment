package JavaAssignments.Assignment8;

import java.util.Scanner;

public class CheckBalance {
    public void checkBalance(){
         final int limit = 4000;
         final int atmLimit = 20000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        String amount = scanner.nextLine();
        scanner.close();
        try{
            if(Integer.parseInt(amount) == 0)
                throw new ZeroBalanceException("Balance is zero");
            else if(Integer.parseInt(amount) < limit )
                throw new LowBalanceException("Balance is less than the limit " + limit);
            else if(Integer.parseInt(amount) > 20000)
                throw new ATMLimit("You cannot withdraw morethan Rs "+ atmLimit + " at a time");
            else if (amount.isEmpty())
                throw new NullPointerException();
            else
                System.out.println(amount);
        }catch (Exception e){
            System.out.println("Error is: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block always gets executed");
        }
    }
}
