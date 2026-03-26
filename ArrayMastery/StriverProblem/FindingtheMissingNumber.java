package ArrayMastery.StriverProblem;

public class FindingtheMissingNumber {

    public static void main(String[] args) {

        int [] arr ={1,2,4,5};
        int n = arr.length+1;
        int expectedSum = n*(n-1)/2;

        int sum=0;
        for(int j : arr){
            sum=+j;
        }


        System.out.print(expectedSum-sum);
    }
}
