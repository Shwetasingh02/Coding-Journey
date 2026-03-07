package functions;

public class voteEligiblePerson {
    public static void main(String[] args) {
        System.out.println(voteEligible(1));
    }

    static String voteEligible(int age){
        if(age >= 18){
            return "You can vote!";
        }
        else{
            return "You cannot vote , Wait for your golden chance";
        }
    }
}
