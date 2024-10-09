package Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int [] items;
    int count; //field to keep track of the number of items;
    private int rear;// pointer that points to where to insert an item;
    private int front;
    public ArrayQueue(int capacity){
        items = new int[capacity];

    }

    public void enqueue(int item){
        if(queueFull())
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count ++;
    }

    public int  dequeue(){
        var item = items[front];
        items[front] = 0 ;
        front = (front + 1 ) % items.length;
        count --;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public boolean queueFull(){
        return count == items.length;
    }
}
