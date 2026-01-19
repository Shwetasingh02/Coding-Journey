package stringHub;

public class sb {

    public static void main(String[] args) {

        StringBuilder builder =new StringBuilder();
        for(int i=0; i<26;i++){
            char ch =(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        // if want to replace the string
        builder.replace(0,6,"shweta");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

    }
}
