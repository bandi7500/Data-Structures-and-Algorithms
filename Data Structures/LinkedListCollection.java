/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.LinkedList;
/**
 *
 * @author cheth
 */
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Add elements
        list.add("Sri Lanka");
        list.add("Canada");
        list.add("Japan");
        list.add("America");
        
        //Add element at first and last positions
        list.addFirst("Korea");
        list.addLast("England");
        
        //Display the LinkedList
        System.out.println("Countries: " + list);
        
        //Remove elements
        list.remove("Canada");
        list.removeFirst();
        list.removeLast();
        
        System.out.println("After removals: " + list);
         
        //Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
    
}
