package ArrayList;

import java.util.ArrayList;

public class ChangeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=10 ;i++){
            numbers.add(i);
        }
        // change the number at 5.
        numbers.set(2,99);

        // remove the number at 5;
        numbers.remove(4);
        System.out.println(numbers);
    }
}
