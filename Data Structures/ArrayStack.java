/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author cheth
 */
public class ArrayStack {
    private int[] stack;    
    private int top;        
    private int capacity;
    
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; 
    }
    // Push an element onto the stack
    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow");
        }
        stack[++top] = item;
    }
    // Pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return stack[top--];
    }
    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); 
        System.out.println(stack.pop());  
        System.out.println(stack.peek()); 
        System.out.println(stack.isEmpty()); 
    }
}
