import java.util.ArrayList;

public class HashTable<T> {
    public ArrayList<SinglyLinkedList> table;

    public HashTable() {
        this.table = new ArrayList<SinglyLinkedList>();
    }

    public void hashAdd(T data) {
        //amend to say, if spot empty add a new list, if not, just prepend.
        this.table.add(new SinglyLinkedList<>());
        table.get(0).prepend(data);
    }

    public void walkTable(int listNumber) {
        table.get(listNumber).nodeWalk();
    }

    public static void main (String args[]) {
        HashTable test = new HashTable();
        test.hashAdd("Thomas");
        test.walkTable(0);
    }
}