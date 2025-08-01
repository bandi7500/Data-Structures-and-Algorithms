/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.HashSet;

/**
 *
 * @author cheth
 */
public class HashSetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Cat"); // Duplicate will not be added

        // Displaying all animals
        System.out.println("Animals in the set: " + animals);

        // Check if a specific animal is in the set
        if (animals.contains("Dog")) {
            System.out.println("Dog is in the set.");
        }

        // Remove an animal
        animals.remove("Elephant");

        // Display the updated set
        System.out.println("Updated animal set: " + animals);

        // Size of the set
        System.out.println("Number of animals: " + animals.size());
    }
    
}
