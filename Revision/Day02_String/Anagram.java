package Revision.Day02_String;

public class Anagram {

    public static void main(String [] arg) {
        String word = "listen";
        String word1 = "silent";
        int freq[] = new int[26];
        int freq1[] = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);
            int index = target - 'a';
            freq[index]++;

        }
        for (int i = 0; i < word1.length(); i++) {
            char target = word1.charAt(i);
            int index = target - 'a';
            freq1[index]++;

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != freq1[i]) {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}
