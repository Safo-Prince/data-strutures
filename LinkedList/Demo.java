package LinkedList;

import java.util.NoSuchElementException;

public class Demo {

    public class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
        }
    }

    private Node first;
    private Node last;


    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        // check if the list is empty or  otherwise
        if (isEmpty()) first = last = node;
        else {
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item) {
        var node = new Node(item);
        //  check if list is empty
        if (first == null) first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        // check  if list is empty
        if (first == null) throw new NoSuchElementException();
        // check  if  the list contains only one element
        if (first == last) {
            first = last = null;
            return;
        }

        //if the list contains more than one
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        var previous = getPrevious(last);
        last = previous;
        last.next = null;

    }


    private Node getPrevious(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node) return current;
        }

        return null;
    }

    public void reverse(){

        var previous = first;
        var current = first.next;

        while(current != null){
           var next = current.next;
           current.next = previous;
           previous = current;
           current = next;
        }


        last = first;
        last.next = null;
        first = previous;

    }

    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();

       var  a = first;
       var b = first;

       for(int i = 0; i < k  - 1; i++){

           b = b.next;
           if(b == null) throw  new IllegalArgumentException();
       }
       while(b != last){
           a = a.next;
           b = b.next;
       }

       return a.value;

    }

}
