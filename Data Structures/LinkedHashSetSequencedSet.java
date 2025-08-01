/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;
/**
 *
 * @author cheth
 */
public class LinkedHashSetSequencedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HashSet: No order guaranteed
        Set<String> hashSetAnimals = new HashSet<>();
        hashSetAnimals.add("Lion");
        hashSetAnimals.add("Zebra");
        hashSetAnimals.add("Elephant");
        hashSetAnimals.add("Giraffe");

        System.out.println("HashSet (no order): " + hashSetAnimals);

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSetAnimals = new LinkedHashSet<>();
        linkedHashSetAnimals.add("Lion");
        linkedHashSetAnimals.add("Zebra");
        linkedHashSetAnimals.add("Elephant");
        linkedHashSetAnimals.add("Giraffe");

        System.out.println("LinkedHashSet (insertion order): " + linkedHashSetAnimals);

        // SequencedSet using LinkedHashSet 
        SequencedSet<String> sequencedAnimals = new LinkedHashSet<>();
        sequencedAnimals.add("Lion");
        sequencedAnimals.add("Zebra");
        sequencedAnimals.add("Elephant");
        sequencedAnimals.add("Giraffe");

        System.out.println("SequencedSet (insertion order): " + sequencedAnimals);
        System.out.println("First animal: " + sequencedAnimals.getFirst());
        System.out.println("Last animal: " + sequencedAnimals.getLast());
    }
}
