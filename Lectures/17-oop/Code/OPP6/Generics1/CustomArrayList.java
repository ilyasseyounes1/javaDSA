package OPP6.Generics1;

import java.util.ArrayList;
import  java.util.Arrays;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    public void add(int value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;  // Increment size after adding element
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // Copy the current items to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;  // Reassign the new array to data
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
