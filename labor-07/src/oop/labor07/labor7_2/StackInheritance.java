package oop.labor07.labor7_2;
import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private final int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }


    public boolean isFull(){
        return capacity == size();
    }

    public boolean isEmpty(){
        return 0 == size();
    }

    public void push(Object object){
        add(object);
    }

    public Object top(){
        return get(getSize()-1);
    }

    public void pop(){
        remove(getSize()-1);
    }

    public int getSize(){
        return size();
    }

}