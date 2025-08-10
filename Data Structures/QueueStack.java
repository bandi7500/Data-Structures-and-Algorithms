/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author cheth
 */
public class QueueStack {
    private Queue<Integer> queue;

        public QueueStack() {
            queue = new LinkedList<>();
        }

        // Push element onto stack
        public void push(int x) {
            queue.add(x);
            // Rotate the queue to make the new element at the front
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.remove());
            }
        }

        // Removes the top element
        public int pop() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return queue.remove();
        }

        // Get the top element
        public int top() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return queue.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    
    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.top()); 
        System.out.println(stack.isEmpty()); 
    }
    
}
