package TwoDArray;

import java.util.Scanner;

public class PrintPositionElement {
    public static void main(String[] args) {

        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner sc =new Scanner(System.in);
        int row ,column;
        System.out.println("Give the position of element : ");
        row=sc.nextInt();
        column=sc.nextInt();
        if(row >= 0 && row < array[0].length && column >=0 && column<array[0].length) {
            System.out.println(array[row][column]);
        }
        else{
            System.out.println("invalid position");
        }
    }
}
