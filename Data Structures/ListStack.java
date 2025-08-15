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
public class ListStack<T> {
    private ArrayList<T> list; // underlying list to store stack elements

    public ListStack() {
        list = new ArrayList<>();
    }

    // Push element onto stack
    public void push(T element) {
        list.add(element); // add to end
    }

    // Pop element from stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1); // remove from end
    }

    // Peek top element
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1); // last element
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get stack size
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        // Example with flowers
        ListStack<String> flowerStack = new ListStack<>();

        flowerStack.push("Rose");
        flowerStack.push("Lily");
        flowerStack.push("Tulip");

        System.out.println("Top flower: " + flowerStack.peek()); 
        System.out.println("Popped flower: " + flowerStack.pop()); 
        System.out.println("Top after pop: " + flowerStack.peek()); 
        System.out.println("Stack size: " + flowerStack.size()); 
    }
}
