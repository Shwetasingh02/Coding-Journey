package stringHub.LeetcodeQuestions;

/*Right move → (i + step) % n
Left move → (i - step + n) % n*/
public class ShortestDistancetoTargetStringinaCircularArray2515 {

    public static void main(String[] args) {

         String[] words = {"a","b","leetcode"};
         String target = "leetcode";
        int startIndex =0;

        int result = closestTarget(words,target,startIndex);
        System.out.print(result);
    }
   static int closestTarget(String[] words, String target, int startIndex) {

        int dis1=0 ,dis2=0;
        int n = words.length;

       for (int i = 0; i < n; i++) {
           int index = (startIndex + i) % n;
            if (words[i].equals(target)) {
                dis1++;
                break;
            }
        }
       for (int i = 0; i < n; i++) {
           int index = (startIndex - i + n) % n;
           if(words[i].equals(target)) {
               dis2++;
               break;
           }
       }
       int min = Math.min(dis1, dis2);
       if (!containsTarget(words, target)) {
           return -1;
       }
       return min;

    }

    private static boolean containsTarget(String[] words, String target) {
        for (String word : words) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
