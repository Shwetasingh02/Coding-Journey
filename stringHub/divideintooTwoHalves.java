package stringHub;

public class divideintooTwoHalves {
    public static void main(String[] args) {
        String s="book";

        int mid = s.length()/2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);

        System.out.println("a :" + a + "\n" +"b :" +b);

    }
}
