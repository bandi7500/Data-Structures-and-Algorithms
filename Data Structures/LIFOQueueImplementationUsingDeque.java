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
public class LIFOQueueImplementationUsingDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Deque (ArrayDeque implementation)
        Deque<String> lifoQueue = new ArrayDeque<>();

        // Push elements (add to front for LIFO)
        lifoQueue.push("First");
        lifoQueue.push("Second");
        lifoQueue.push("Third");

        System.out.println("LIFO Queue (Stack) Contents: " + lifoQueue);

        // Pop elements (remove from front for LIFO)
        System.out.println("Popped: " + lifoQueue.pop());
        System.out.println("Popped: " + lifoQueue.pop());

        System.out.println("Remaining: " + lifoQueue);
    }
}
