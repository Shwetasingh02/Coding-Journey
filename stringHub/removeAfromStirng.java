package stringHub;

public class removeAfromStirng {

    public static void main(String[] args) {
        String s= "abbadredgyqaaaabc";

        System.out.println(RemoveCharA(s));
    }

    static StringBuilder RemoveCharA(String s){

        StringBuilder builder = new StringBuilder();

        for(int i=0 ; i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!='a'){
                builder.append(ch);
            }
        }
        return builder;
    }
}
