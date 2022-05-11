package oop.labor07.labor7_2;

import java.util.ArrayList;

public class StackAggregation{
    ArrayList <Object> items = new ArrayList<>();
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return capacity == items.size();
    }

    public boolean isEmpty(){
        return 0 == items.size();
    }

    public void push(Object object){
        items.add(object);
    }

    public Object top(){
        return items.get(getSize());
    }

    public void pop(){
        items.remove(getSize());
    }

    public int getSize(){
        return items.size()-1;
    }

    @Override
    public String toString() {
        return "StackAggregation{" +
                "items=" + items +
                '}';
    }
}