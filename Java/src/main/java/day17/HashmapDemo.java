package day17;

import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {
        // Declaration with generics
        HashMap<Integer, String> mymap = new HashMap<>();
        
        // Inserting values
        mymap.put(101, "Shubham");
        mymap.put(101, "Patil"); // This will overwrite "Shubham"
        mymap.put(102, "ABCD");
        mymap.put(103, "SQRQZQ");
        mymap.put(104, "Euuu");
        
        // Print the HashMap
        System.out.println("HashMap: " + mymap);
        
        // Size of HashMap
        System.out.println("Size of HashMap: " + mymap.size());
        
        // Removing data
        mymap.remove(101);
        System.out.println("HashMap after removal: " + mymap);
        
        // Get data of a specific key
        System.out.println("Value for key 103: " + mymap.get(103));
        
        // Print all keys from HashMap
        System.out.println("Keys: " + mymap.keySet());
        
        // Print values from HashMap
        System.out.println("Values:");
        for (String value : mymap.values()) {
            System.out.println(value);
        }
    }
}
