package stringHub.LeetcodeQuestions;

public class GoalParserInterpretation1678 {

    public static void main(String[] args) {
        String command="G()(al)";
        int n = command.length();
        char[] comm = command.toCharArray();
        StringBuilder result = new StringBuilder();

        for(char ch =0; ch< comm.length;ch++){
            if(comm[ch] =='(' && comm[ch+1] ==')'){
                result.append('o');
                ch++;
            }
            else if(comm[ch]=='(' && comm[ch+1]== 'a'){

                result.append("al");
                ch +=3;
            }else {
                result.append(comm[ch]);
            }
        }
        System.out.println(result.toString());
    }
}
