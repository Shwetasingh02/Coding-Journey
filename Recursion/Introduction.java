package Recursion;

public class Introduction {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int i) {

        System.out.println("Value of i = " + i);

        if (i == 5) {
            return;
        }

        print(i + 1); // 🔴 Step Into (F7) here
    }
}
