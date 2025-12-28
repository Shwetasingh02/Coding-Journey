package TwoDArray;

public class SpiralMatrix {

    public static void main(String[] args) {

        int array[][] = {
                {1,2,3},{4,5,6},{7,8,9}
        };

       int toprow=0;
       int bottomrow= array.length-1;
       int leftcol=0;
       int rightcol= array.length-1;




         while(toprow <=bottomrow && leftcol<=rightcol){

             // first row printing
             for(int col =leftcol ; col <=rightcol ;col++){
                 System.out.print(array[toprow][col]+" ");
             }
             toprow++;
             // right col print

              for(int row =toprow ;row<=bottomrow ; row++){
                 System.out.print( array[row][rightcol] +" ");
             }

              rightcol--;

              if(toprow<=bottomrow){
            for(int col =rightcol ; col>=leftcol ;col--){
                System.out.print( array[bottomrow][col] +" ");
            }
        }
              bottomrow--;

              if(leftcol<=rightcol){
                  for(int row =bottomrow ; row<=rightcol ;row++){
                      System.out.print(array[row][leftcol]+" ");
                  }
                     leftcol++;
              }
       }

         System.out.println();
    }
}
