package ArrayList;

import java.util.ArrayList;

public class EvenNumber {

    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();

        for(int i=1; i<= 10;i++){
            if(i%2==0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);

    }
}
