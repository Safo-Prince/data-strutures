import HashMaps.HashTable;
import LinkedList.Demo;

public class Main {

    public static void main(String[] args) {
   var table = new HashTable();
   table.put(6,"A");
   table.put(8,"B");
   table.put(11,"C");
   table.put(6,"A+");


        System.out.println(table.get(11));

    }
}