package Stack;

import java.util.Arrays;

public class Stack {

    private int count;
    private int [] items = new int[5];
    public void push(int item){
        if(count == items.length) throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop (){
        if(isEmpty()) throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty(){
        return  count == 0 ;
    }

    public int peek(){
        if(isEmpty()) throw new IllegalStateException();

        return items[count - 1];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }
}
