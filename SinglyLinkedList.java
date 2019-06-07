//This would be the perfect time to learn more about generics

public class SinglyLinkedList<T> {

    public Node head;

    public void prepend(T data) {
        Node new_head = new Node(data);
        new_head.setNext(head);
        head = new_head;
    }

    public void nodeWalk() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public class Node<T> {

        public T data;
        public Node next;

        public Node(T data) {
            this.setData(data);
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();
        test.prepend("String");
        System.out.println(test.head.getData());
        test.prepend(12);
        System.out.println(test.head.getData());
        test.prepend(12.0);
        System.out.println(test.head.getData());
        test.prepend(null);
        System.out.println(test.head.getData());
        System.out.println(test.head.next.getData());
        System.out.println(test.head.next.next.getData());
        System.out.println(test.head.next.next.next.getData());

        //Node test = new Node();
        //test.setData("Hello World");
        //System.out.println(test.getData());
    }
}