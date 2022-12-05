package day03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String [] args) {

        // Key / Value type
        // String, Integer

        HashMap<String, ArrayList<String>> usermap = new HashMap<String, ArrayList<String>>();

        usermap.put("John", new ArrayList<String>());
        usermap.put("Fred", new ArrayList<String>());
        usermap.put("Ken", new ArrayList<String>());

        ArrayList<String> myarray = new ArrayList<String>();
        ArrayList<String> myarray2 = new ArrayList<String>();

        myarray.add("Ace");

        // add a key, value pair to it
        usermap.put("Hello", myarray);
        usermap.put("Za", myarray2);

        String key = "Hello";
        System.out.println("Value for key = " + key + " -> " + usermap.get(key));

        usermap.put("Hello", myarray);
        System.out.println("New value for key = " + key + " - > " + usermap.get(key));

        // check if a key exists in map
        System.out.println("Check if Fred exists: " + usermap.containsKey("fred"));

    }
    
}
