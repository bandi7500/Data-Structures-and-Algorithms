/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author cheth
 */
public class PriorityQueueQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Queue using LinkedList (FIFO)
        Queue<String> planetQueue = new LinkedList<>();
        planetQueue.add("Mercury");
        planetQueue.add("Venus");
        planetQueue.add("Earth");
        planetQueue.add("Mars");

        System.out.println("Queue (FIFO): " + planetQueue);
        System.out.println("Peek (first planet): " + planetQueue.peek());
        planetQueue.poll(); // removes the first (Mercury)
        System.out.println("After poll: " + planetQueue);

        // PriorityQueue (alphabetical order)
        PriorityQueue<String> planetPriorityQueue = new PriorityQueue<>();
        planetPriorityQueue.add("Mercury");
        planetPriorityQueue.add("Venus");
        planetPriorityQueue.add("Earth");
        planetPriorityQueue.add("Mars");

        System.out.println("\nPriorityQueue (alphabetical order): " + planetPriorityQueue);
        System.out.println("Peek (highest priority): " + planetPriorityQueue.peek());
        planetPriorityQueue.poll(); // removes the alphabetically first (Earth)
        System.out.println("After poll: " + planetPriorityQueue);
    }
    
}
