/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.Stack;
/**
 *
 * @author cheth
 */
public class StackQueue {
    private Stack<Integer> stack1; // For enqueue
    private Stack<Integer> stack2; // For dequeue

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add element to the queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Remove element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        // If stack2 is empty, move elements from stack1
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
         StackQueue queue = new StackQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    
        System.out.println(queue.dequeue()); 
        System.out.println(queue.isEmpty()); 
    }
    
}
