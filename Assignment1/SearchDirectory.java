package JavaAssignments.Assignment1;

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class SearchDirectory {
    String pattern;
    public SearchDirectory(String pattern) {
        this.pattern = pattern;
    }
    List<String> matchedFiles=new ArrayList<String>();

    public List<String> searchFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                searchFiles(file.listFiles()); // calling the method recursively
            }
            else if(Pattern.matches( pattern, file.getName()))
                matchedFiles.add(file.getAbsolutePath());
        }
        return matchedFiles;
    }
}

