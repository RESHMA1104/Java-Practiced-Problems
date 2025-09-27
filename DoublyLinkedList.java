class Node{
    Node prev;
    int data;
    Node next;
    Node(int val){
        data = val;
        prev = null;
        next = null;
    }
}
public class DoublyLinkedList {
    static Node head = null;
    static Node tail = null;
    static void insert(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    static void insertAtBeginning(int val){
        Node current = new Node(val);
        if(head == null){
            head = current;
            tail = current;
        }
        else{
            current.next = head;
            head.prev = current;
            head = current;
        }
    }
    public static void display(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("NULL");
        
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        display();
        insertAtBeginning(40);
        display();
    }
}




/*
// Doubly LinkedList creation
class Node{
    Node prev;
    int data;
    Node next;
    Node(int val){
        data = val;
        prev = null;
        next = null;
    }
}
public class DoublyLinkedList {
    static Node head = null;
    static Node tail = null;
    static void insert(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    public static void display(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("NULL");
        
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        display();
    }
}
*/