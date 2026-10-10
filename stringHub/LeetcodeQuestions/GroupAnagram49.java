package stringHub.LeetcodeQuestions;

import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class GroupAnagram49 {

    public static void main(String[] main){

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String> >map = new HashMap<>();

        for(String word : strs) {
            char[] letter = word.toCharArray();
            Arrays.sort(letter);
            String setword = new String(letter);

            map.computeIfAbsent(setword, k -> new ArrayList<>()).add(word);
        }
            List<List<String>> result = new ArrayList<>(map.values());
            System.out.print(result);

        }
}
