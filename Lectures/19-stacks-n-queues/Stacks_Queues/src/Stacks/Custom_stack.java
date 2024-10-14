package Stacks;

public class Custom_stack{
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public Custom_stack (){
        this(DEFAULT_SIZE);
    }
    public Custom_stack (int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        ptr++;
        data[ptr] = item;
        return true;
    }
    private boolean isEmpty (){
        return ptr == -1;
    }
    private boolean isFull (){
        return ptr == data.length - 1;
    }

    public int pop()throws StackException{
        if (isEmpty ()){
            throw new StackException ("cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek()throws StackException{
        if (isEmpty ()){
            throw new StackException ("cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
}
