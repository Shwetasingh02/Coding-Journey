package stringHub.LeetcodeQuestions;

import java.util.*;
public class CountItemsMatchingaRule1773 {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "silver"));
        String rulevalue = "silver";
        String ruleKey="color";
        String ruleValue="silver";
        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println(result);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index=0;
        if(ruleKey.equals("type")){
            index=0;
        } else if (ruleKey.equals("color")) {
            index=1;
        } else if (ruleKey.equals("name")) {
            index=3;
        }

        int count=0;
        for(int i=0; i< items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
