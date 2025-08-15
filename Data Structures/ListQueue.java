/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.ArrayList;
/**
 *
 * @author cheth
 */
public class ListQueue<T> {
    private ArrayList<T> list;

    public ListQueue() {
        list = new ArrayList<>();
    }

    // Add element to the end (enqueue)
    public void enqueue(T element) {
        list.add(element);
    }

    // Remove element from the front (dequeue)
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.remove(0);
    }

    // Peek at the front element without removing
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.get(0);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get size of the queue
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        ListQueue<String> flowerQueue = new ListQueue<>();

        flowerQueue.enqueue("Rose");
        flowerQueue.enqueue("Lily");
        flowerQueue.enqueue("Tulip");

        System.out.println("Front flower: " + flowerQueue.peek()); 
        System.out.println("Dequeued flower: " + flowerQueue.dequeue()); 
        System.out.println("Front after dequeue: " + flowerQueue.peek()); 
        System.out.println("Queue size: " + flowerQueue.size()); 
    }
}
