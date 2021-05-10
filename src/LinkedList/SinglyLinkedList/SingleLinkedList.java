package LinkedList.SinglyLinkedList;

import java.util.LinkedList;

public class SingleLinkedList {
    public class Node {
        int val;
        Node next;
        Node(int val,Node next) {
            this.val=val;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(int value){
        Node newest=new Node(value,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;

        tail=newest;
        size++;
    }

    public void display(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println(" ");
    }

    public void addFirst(int value){
        Node newest=new Node(value,null);
        if(isEmpty()){
            head=newest;
            tail=newest;
        }
        else{
            newest.next=head;
            head=newest;
        }
        size++;
    }

    public void add(int value, int position){
        if(position<=0 || position>size) {
            System.out.println("Invalid Position");
            return;
        }
        if(position==1) {
            addFirst(value);
            return;
        }
        if(position==size){
            addLast(value);
            return;
        }
        int index=0;
        Node cur=head;
        while(index<position-1){
            cur=cur.next;
            index++;
        }
        Node newest=new Node(value,null);
        newest.next=cur.next;
        cur.next=newest;
        size++;
    }

    public int deleteFirst(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return -1;
        }
        int deletedElement=head.val;
        head=head.next;
        size--;
        if(isEmpty())
            tail=null;
        return deletedElement;

    }

    public int deleteLast(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return -1;
        }
        if(length()==1){
            return deleteFirst();
        }
        int index=1;
        Node cur=head;
        while(index<size-1){
            cur=cur.next;
            index++;
        }
        tail=cur;
        int deletedElement=cur.next.val;
        tail.next=null;
        size--;
        return deletedElement;
    }

    public int delete(int position){
        if(position<=0 || position>size){
            System.out.println("Invalid position");
            return -1;
        }
        if(position==1)
            return deleteFirst();
        if(position==size)
            return deleteLast();
        int index=1;
        Node cur=head;
        while(index<position-1){
            cur=cur.next;
            index++;
        }
        int deletedElement=cur.next.val;
        cur.next=cur.next.next;
        size--;
        return deletedElement;

    }

    public int search(int key){
        int index=1;
        Node cur=head;
        while(index<=size){
            if(cur.val==key)
                return index;
            cur=cur.next;
            index++;
        }
        return -1;
    }

    public void insertSorted(int value){
        Node newest=new Node(value,null);
        if(isEmpty()){
            head=newest;
            tail=newest;
        }
        else {
            Node cur = head;
            Node prev = head;
            while (cur != null && cur.val < value) {
                prev = cur;
                cur = cur.next;
            }
            if (cur == head) {
                newest.next = head;
                tail = newest.next;
                head = newest;
            } else {
                newest.next = prev.next;
                prev.next = newest;
            }
        }
        size++;

    }
    public static void main(String[] args) {
        SingleLinkedList l=new SingleLinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l .display();
        l.addFirst(0);
        l.display();
        l.add(12,4);
        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        l.delete(2);
        l.display();
        System.out.println(l.search(3));
        SingleLinkedList ll=new SingleLinkedList();
        for(int i=3;i>0;i--)
            ll.insertSorted(i);
        ll.display();

    }
}
