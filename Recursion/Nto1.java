package Recursion;

public class Nto1 {

    public static void main(String[] args) {
        fun(5);
        funRers(5);
    }

    private static void funRers(int i) {
        if(i==0) {
            return;
        }
        fun(i-1);
        System.out.print(i+" ");
        System.out.println();
    }

    private static void fun(int i) {

        if(i==0) {
            return;
        }
        System.out.print(i+" ");
        fun(i-1);

    }
}
