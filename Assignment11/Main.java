package JavaAssignments.Assignment11;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharacterCount counter = new CharacterCount();
        counter.countCharacters("/home/luqmaan/IdeaProjects/Main/src/JavaAssignments/Assignment11/input");
        counter.writeToFile("/home/luqmaan/IdeaProjects/Main/src/JavaAssignments/Assignment11/Output");
    }
}