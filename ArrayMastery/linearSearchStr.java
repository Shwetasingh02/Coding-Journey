package ArrayMastery;

public class linearSearchStr {

    public static void main(String[] args) {
        String str ="Shweta";
        String target = "a";

        int ans= linearSearchString(str ,target);
        System.out.println(ans);
    }

    static int linearSearchString(String str , String target) {

        if (str.length() == 0) {
            return -1;
        }

        for (int word = 0; word < str.length(); word++) {
            if (str.charAt(word) == target.charAt(0)) {
                return word;
            }
        }
            return -1;
        }
    }
