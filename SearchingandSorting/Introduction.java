package SearchingandSorting;

public class Introduction {
    public static void main(String[] args) {

       int a=100 , b=3;

        System.out.println(div(a,b));
    }

    static int div(int a,int b){
    int count=0;
    int sum =b;
    while(sum<=a){
        sum+=b;
        count++;
    }
    return count;
    }
}