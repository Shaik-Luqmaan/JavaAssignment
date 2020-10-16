package JavaAssignments.Assignment2;

import java.util.HashSet;

public class StringCheck {
    HashSet<Character> hs =new HashSet<>();
    public boolean hasLetters(String input){
        input = input.toLowerCase();

        for(int i=0;i<input.length();i++) {
            if(Character.isLetter(input.charAt(i)))
                hs.add(input.charAt(i));
        }
        if(hs.size()== 26){
            return true;
        }
            return false;

    }

}
