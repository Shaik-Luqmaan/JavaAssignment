package JavaAssignments.Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VampireNumber {

    public static void main(String[] args) {
        for (int first = 10; first < 100; first++) {
            String fang1 = String.valueOf(first);
            for (int second = first; second < 100; second++) {
                int vampire = first * second;
                String fang2 = String.valueOf(second);
                String vampireNumber = String.valueOf(vampire);
                if (sortVampire(fang1 + fang2).equals(sortVampire(vampireNumber))) {
                    System.out.printf("%d * %d = %d %n", first, second, vampire);
                }
            }
        }
    }
    private static List<Character> sortVampire(String vampireNumber) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < vampireNumber.length(); i++) {
            list.add(vampireNumber.charAt(i));
        }
        Collections.sort(list);
        return list;
    }
}
