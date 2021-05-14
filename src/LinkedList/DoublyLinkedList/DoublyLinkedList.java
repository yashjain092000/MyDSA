package LinkedList.DoublyLinkedList;


import LinkedList.SinglyLinkedList.SingleLinkedList;

public class DoublyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    DoublyLinkedList(){
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
        Node newest=new Node(value,null,null);
        if(isEmpty())
            head=newest;
        else {
            tail.next = newest;
            newest.prev=tail;
        }
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
        Node newest=new Node(value,null,null);
        if(isEmpty()){
            head=newest;
            tail=newest;
        }
        else{
            newest.next=head;
            head.prev=newest;
            head=newest;
        }
        size++;
    }

    public void add(int value, int pos){
        if(pos<=0 || pos>size) {
            System.out.println("Invalid Position");
            return;
        }

        int index=1;
        Node cur=head;
        while(index<pos-1){
            cur=cur.next;
            index++;
        }
        Node newest=new Node(value,null,null);
        newest.next=cur.next;
        cur.next.prev=newest;
        cur.next=newest;
        newest.prev=cur;
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
        else
            head.prev=null;
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
        int deletedElement=tail.val;
        tail=tail.prev;
        tail.next=null;
        size--;
        return deletedElement;
    }
    public int delete(int pos){
        if(pos<=0 || pos>size){
            System.out.println("Invalid position");
            return -1;
        }

        Node cur=head;
        int index=1;
        while(index<pos-1){
            cur=cur.next;
            index++;
        }
        int deletedElement=cur.next.val;
        cur.next=cur.next.next;
        cur.next.prev=cur;
        size--;
        return deletedElement;

    }
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.display();
        l.addFirst(0);
        l.display();
        l.add(12,1);
        l.display();
        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        l.delete(2);
        l.display();
    }

}
