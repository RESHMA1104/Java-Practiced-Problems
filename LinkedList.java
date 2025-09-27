// LinkedList InsertBegin and DeletePosition Operation
import java.util.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    static LinkedList insertbegin(LinkedList list, int val){
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    static LinkedList DeletePos(LinkedList list, int pos){
        Node current = list.head;
        for(int i=1; i<pos-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return list;
    }
    static void display(LinkedList list){
        System.out.println("Linked List");
        Node current = list.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int ib = sc.nextInt();
            list = insertbegin(list, ib);
        }
        display(list);
        int pos = sc.nextInt();
        list = DeletePos(list, pos);
        display(list);
    }
}




/*
// LinkedList InsertBegin and Insert Position Operation
import java.util.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    static LinkedList insertbegin(LinkedList list, int val){
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    static LinkedList InsertPos(LinkedList list, int pos, int val){
        Node newnode = new Node(val);
        Node temp = list.head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return list;
    }
    static void display(LinkedList list){
        System.out.println("Linked List");
        Node current = list.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int ib = sc.nextInt();
            list = insertbegin(list, ib);
        }
        display(list);
        int pos = sc.nextInt();
        int x = sc.nextInt();
        list = InsertPos(list, pos, x);
        display(list);
    }
}
*/




/*
// LinkedList Insert and InsertBegin Operation
import java.util.*;
public class LinkedList{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    // insert 
    static LinkedList insert(LinkedList list , int val)
    {
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        return list;
    }
    // insertBegin
    static LinkedList insertBegin(LinkedList list, int val){
        Node newnode = new Node(val);
        if(list.head==null){
            list.head = newnode;
        }
        else{
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    // display 
    static void display(LinkedList list)
    {
        System.out.println("Linked List : ");
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){  
            int k = sc.nextInt();
            list = insert(list, k);
        }
        display(list);
        int ib = sc.nextInt();
        list = insertBegin(list, ib);
        display(list);
    }
}
*/




/*
// LinkedList InsertBegin and DeleteBegin Operation
import java.util.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    static LinkedList insertbegin(LinkedList list, int val){
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    static LinkedList deleteBegin(LinkedList list){
        Node current = list.head;
        list.head = current.next;
        current = null;
        return list;
    }
    static void display(LinkedList list){
        System.out.println("Linked List");
        Node current = list.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            
            int ib = sc.nextInt();
            list = insertbegin(list, ib);
        }
        display(list);
        list = deleteBegin(list);
        display(list);
    }
}
*/



/*
// LinkedList InsertBegin and DeleteLast Operation
import java.util.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    static LinkedList insertbegin(LinkedList list, int val){
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    static LinkedList deleteLast(LinkedList list){
        Node current = list.head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null; 
        return list;
    }
    static void display(LinkedList list){
        System.out.println("Linked List");
        Node current = list.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            
            int ib = sc.nextInt();
            list = insertbegin(list, ib);
        }
        display(list);
        list = deleteLast(list);
        display(list);
    }
}
*/




/*
// LinkedList Basic insertion
public class LinkedList{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    // insert 
    static LinkedList insert(LinkedList list , int val)
    {
        Node newnode = new Node(val);
        if(list.head == null){
            list.head = newnode;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        return list;
    }
    // display 
    static void display(LinkedList list)
    {
        System.out.println("Linked List : ");
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 10);
        list = insert(list, 20);
        list = insert(list, 30);
        list = insert(list, 40);
        display(list);
    }
}
*/