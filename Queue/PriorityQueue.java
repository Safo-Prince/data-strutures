package Queue;

public class PriorityQueue {
   public int [] items;
   private int count;

    public void add(int item) {
        if(isFull())
            throw new IllegalStateException();

    var i = shiftItemsToInsert(item);
    items[i] = item;
    count++;
   }


   public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
   }

   public int shiftItemsToInsert(int item){
       int i = 0;
       // shifting items
       for(i = count - 1; i >= 0; i-- ){
           if(items[i] > item)
               items[i + 1] = items[i];
           else
               break;
       }
       return i + 1;
    }

   public boolean isFull(){
        return count ==  items.length;
   }
   public boolean isEmpty(){
        return count == 0;
   }
}
