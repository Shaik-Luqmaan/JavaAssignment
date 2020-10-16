/* Create a java program to search through the home directory and
look for files that match a regular expression.
The program should be able to take inputs repeatedly and
should print out the full absolute path of the matching files found.
 */
package JavaAssignments.Assignment1;
import java.util.Scanner;
import java.io.File;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String location = System.getProperty("user.home");
        File file = new File(location);
        File[] files=file.listFiles();

        System.out.println("Enter the pattern to search the files");
        String pattern=sc.next();

        SearchDirectory sd= new SearchDirectory(pattern);
        for(String s:sd.searchFiles(files))
            System.out.println(s);
    }
}
