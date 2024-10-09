package LinkedList;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Demo{

    private int count;
    private int [] items;

    public void add(int item){
        if(isFull())
            throw new IllegalStateException();

       int i = shiftItemsToInsert(item);
        items[1] = item;
        count++;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int shiftItemsToInsert(int item){
        int i = 0;
        for(i = count-1; i>=0; i--){
            if(items[i] > item)
                items[i+1] = item;
            else
                break;
        }

        return i+1 ;
    }
public boolean isEmpty(){
        return count == 0;
}
    public boolean isFull(){
        return count == items.length;
    }

}