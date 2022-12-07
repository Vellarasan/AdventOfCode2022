package org.Day6;

import org.Utils.FileUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainDay6 {

    public static void main(String[] args) {

        List<String> fileContent = FileUtil.getFileContent("Day6File.txt");
        String eachLine = fileContent.get(0);

        for (int i = 0; i < eachLine.length(); i++) {
            if (i < eachLine.length() - 13) {
                String substring1 = eachLine.substring(i, i + 14);

                boolean isDuplicatePresent = checkDuplicateChar(substring1);

                if (isDuplicatePresent) {
                    System.out.println(substring1 + " Has duplicates");
                } else {
                    System.out.println("RESULT COULD BE : " + (i + 14));
                    break;
                }
            }
        }
    }

    private static boolean checkDuplicateChar(String substring1) {
        char[] chars = substring1.toCharArray();
        Set<String> res = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            res.add(String.valueOf(chars[i]));
        }
        //System.out.println("Inside the set " + res);
        //System.out.println(res.size());
        return substring1.length() != res.size();
    }
}