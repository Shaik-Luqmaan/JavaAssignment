package JavaAssignments.Assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount{
    HashMap<Character, Integer> countMap = new HashMap<>();

    public void countCharacters(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            for(int i = 0; i < line.length(); i++) {
                char character = line.charAt(i);
                if(!countMap.isEmpty() &&  countMap.containsKey(character)) {
                    countMap.replace(character, countMap.get(character) + 1);
                }
                else {
                    countMap.put(character, 1);
                }
            }
        }
    }

    public void writeToFile(String filepath) throws IOException {
        FileWriter fw = new FileWriter(filepath);

        for(Map.Entry<Character,Integer> m : countMap.entrySet()){
            fw.write(m.getKey() + " : " + m.getValue() + "\n" );
        }
        fw.close();
    }
}
