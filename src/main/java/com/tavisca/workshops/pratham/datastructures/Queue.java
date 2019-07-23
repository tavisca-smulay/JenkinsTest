package com.tavisca.workshops.pratham.datastructures;

import java.util.ArrayList;

public class Queue<T> {
    int size;
    int capacity;
    int defaultCapacity = 2;
    ArrayList<T> array;

    Queue(){
        this.capacity = defaultCapacity;
        array = new ArrayList<T>(defaultCapacity);
    }

    Queue(int capacity){
        this.capacity = capacity;
        array = new ArrayList<>(capacity);
    }

    public boolean isFull(Queue queue){
        if(queue.size == queue.capacity){
            return true;
        }
        else return false;
    }

    public boolean isEmpty(Queue queue){
        if(queue.size == 0){
            return true;
        }
        else return false;
    }

    void add (T item) throws Exception {
        if(isFull(this)) {
            throw new Exception();
        }
        array.add(item);
        //System.out.println(item + "Added");
    }

    void remove()
    {

        //System.out.println(array.get(0) + "Removed");
        array.remove(0);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Queue queue = new Queue(5);
        queue.add(2);
        queue.add(7);
        queue.add(6);
        queue.remove();
        queue.add(8);
        queue.add(9);
        queue.remove();
    }
}

