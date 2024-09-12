package OPP6.Generics1;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList <T> {
    private Object [] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size= 0 ;
    public CustomGenArrayList (){
        this.data = new Object[DEFAULT_CAPACITY];
    }
    public void add (T value){
        if (isFull()){
            resize();
        }
        data[size] = value;
    }

    private void resize () {
        Object [] temp = new Object [data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
    }

    private boolean isFull () {
        return size == data.length;
    }

    public T remove (){
        T removed = (T)data[--size];
        return removed;
    }
    public T get (int index){
        return (T) data [index];
    }
    public void set (int index, int value){
        data[index] = value;
    }

    @Override
    public String toString () {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString ( data ) +
                ", size=" + size +
                '}';
    }

    public static void main( String[] args) {
        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<Integer>();
        for (int i = 0; i < 14; i++) {
            list3.add(2*i);
        }
        System.out.println (list3);
    }
}
