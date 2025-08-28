/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author cheth
 */
public class ArrayList {
    private String[] data;  
    private int size;       
    private int capacity;
    
     public ArrayList() {
        capacity = 5; 
        data = new String[capacity];
        size = 0;
    }

    // Add flower to the list
    public void add(String flower) {
        ensureCapacity();
        data[size++] = flower;
    }

    // Get flower at index
    public String get(int index) {
        checkIndex(index);
        return data[index];
    }

    // Set flower at index
    public void set(int index, String flower) {
        checkIndex(index);
        data[index] = flower;
    }

    // Remove flower at index
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // Get current size
    public int size() {
        return size;
    }

    // Ensure array has space
    private void ensureCapacity() {
        if (size == capacity) {
            capacity = capacity * 2;
            String[] newData = new String[capacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    // Validate index
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
    }
    
    public static void main(String[] args) {
        ArrayList flowers = new ArrayList();

        // Adding flowers
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Orchid");
        flowers.add("Daisy");

        System.out.println("Flower at index 2: " + flowers.get(2)); // Tulip

        // Updating a flower
        flowers.set(1, "Sunflower");
        System.out.println("After update, index 1: " + flowers.get(1)); // Sunflower

        // Removing a flower
        flowers.remove(0);
        System.out.println("After removing index 0, first flower: " + flowers.get(0)); // Sunflower

        System.out.println("Total flowers: " + flowers.size()); // 4
    }
    
}
