/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.Deque;
import java.util.ArrayDeque;
/**
 *
 * @author cheth
 */
public class FIFOQueueUsingDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Deque (ArrayDeque implementation)
        Deque<String> fifoQueue = new ArrayDeque<>();

        // Enqueue elements (add to rear)
        fifoQueue.addLast("First");
        fifoQueue.addLast("Second");
        fifoQueue.addLast("Third");

        System.out.println("FIFO Queue: " + fifoQueue);

        // Dequeue elements (remove from front)
        System.out.println("Removed: " + fifoQueue.removeFirst());
        System.out.println("Removed: " + fifoQueue.removeFirst());

        System.out.println("Remaining: " + fifoQueue);
    }
    
}
