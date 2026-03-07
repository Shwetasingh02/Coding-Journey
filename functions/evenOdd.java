package functions;

public class evenOdd {
    public static void main(String[] args) {

        System.out.println(evenoddNumber(988776887));
    }
    static String evenoddNumber(int num){
        if(num%2==0){
            return "Even Number";
        }
        else{
            return "Odd Number";
        }
    }
}
