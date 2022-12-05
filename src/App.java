package day03;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        System.out.println("Array List Demo");

        // Create an ArrayList object
        ArrayList<String> myList = new ArrayList<String>();

        // Add items to it
        myList.add("apples");
        myList.add("orange");

        // Loop over and print the items
        for (String item : myList) {
            System.out.println("Item -> " + item);
        }

        // Remove "apples" from this list
        myList.remove("apples");
        
        for (String item : myList) {
            int count = myList.size();
            System.out.println(count);
        }


    }
}
