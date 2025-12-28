package functions;

import java.util.Scanner;

public class circlefunction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        float radius = sc.nextFloat();
        System.out.println("Circumference :" + circumference(radius ,3.14f));
        System.out.println("Area : " + area(radius ,3.14f));

    }
    static float circumference(float radius ,float pi){
        return 2*pi*radius;
    }
    static float area(float radius,float pi){
        return pi*radius*radius;
    }
}
