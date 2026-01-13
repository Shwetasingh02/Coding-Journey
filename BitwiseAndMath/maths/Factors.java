package BitwiseAndMath.maths;

public class Factors {

    public static void main(String[] args) {

        int n=20;

        int []ans=factor(n);
        for(int i=0;i<ans.length;i++){
            if (ans[i] != 0) {
                System.out.print(ans[i] + " ");
            }
        }
    }
     static int [] factor(int n) {
        int p=0;
        int [] result =new int[n];

        for(int i=1;i<=n;i++){
            if(n%i==0){
                result[p]=i;
                p++;
            }
        }
        return result;
    }
}
