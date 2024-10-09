package Queue;


import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();

public void enqueue(int item){
    stack1.push(item);
}

public int dequeue(){
    if(isEmpty())
        throw new IllegalStateException();

    moveFromStack1toStack2();
    return stack2.pop();
}

public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

    moveFromStack1toStack2();

    return stack2.peek();
    }

    private void moveFromStack1toStack2() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty())
                stack2.push( stack1.pop());
        }
    }

    public boolean isEmpty(){
     return stack1.isEmpty() && stack2.isEmpty();
}
}