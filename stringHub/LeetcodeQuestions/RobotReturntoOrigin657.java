package stringHub.LeetcodeQuestions;

public class RobotReturntoOrigin657 {

    public static void main(String[] args) {
        String moves="DURDLDRRLL";

        int x=0,y=0;
        for (char ch : moves.toCharArray() ){
            if(ch=='L') x++;
            else if (ch=='R') x--;
            else if (ch=='U') y++;
            else if (ch=='D') y--;
        }
        if( x==0 && y==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
