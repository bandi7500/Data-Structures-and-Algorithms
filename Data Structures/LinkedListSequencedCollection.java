/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author cheth
 */
public class LinkedListSequencedCollection {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        //Add elements in sequence
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println("Original Sequence: " + numbers);
        
        //Insert element at index 2
        numbers.add(2, 99);
        System.out.println("After inserting at index 2: " + numbers);
        
        //Iterate using an Iterator
        System.out.print("Sequence using Iterator: ");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        
        //Remove element
        numbers.remove(Integer.valueOf(99));
        System.out.println("After removing 99: " + numbers);

        //Access element at index
        System.out.println("Element at index 3: " + numbers.get(3));

        //Clear the sequence
        numbers.clear();
        System.out.println("Is sequence empty? " + numbers.isEmpty());
    }
    
}
