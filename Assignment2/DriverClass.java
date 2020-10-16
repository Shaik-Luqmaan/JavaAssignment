/*
Write a java function that checks if the input string
contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution
as comments in the source file.
*/
// time complexity is O(n)
//space complexity is O(n)

package JavaAssignments.Assignment2;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String input = s.nextLine();

        StringCheck sc =new StringCheck();

        if(sc.hasLetters(input)) {
            System.out.println("Input string contains all the alphabets");
        }
        else {
            System.out.println("Input String does not contain all the alphabets");
        }
    }

}
