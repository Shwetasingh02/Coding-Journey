package TwoDArray;

public class BoundaryElement {

    public static void main(String[] args) {

        int arrar[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };

        BoundaryValue(arrar);
    }

    static void BoundaryValue(int arrar[][]){
        for(int row = 0; row< arrar.length;row++){
            for(int col=0; col<arrar[row].length;col++) {
                if (col == 0 || row == 0 || col == 3 || row == 3) {
                    System.out.print(arrar[row][col] + " ");
                }
            }
            }
        }
    }

