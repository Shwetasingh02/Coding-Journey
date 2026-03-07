package ArrayList;

import java.util.ArrayList;

public class ArrayListIntroduction {

    public static void main(String[] args) {

        ArrayList<String> toys = new ArrayList<>();

        // to add element in the arraylist
        toys.add("Car");
        toys.add("Doll");
        toys.add("Gun");

        //to get element from the array list
        toys.get(1);

        //to set the new element on the place of the existing element
        toys.set(0,"truck");
        System.out.println(toys);

        //to get the size of the element
        System.out.println("To get the size of the arraylist: "+toys.size());

        // to clear the arrayList
        toys.clear();

    }
}
