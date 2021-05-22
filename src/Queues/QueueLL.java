package Queues;

public class QueueLL {
    class Node{
        int val;
        Node next;
        Node(int value,Node n){
            val=value;
            next=n;
        }

    }
   private Node front,rear;
    private     int size;
    QueueLL(){
        front=null;
        rear=null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void enqueue(int value){
        Node newest=new Node(value,null);
        if(isEmpty())
            front=newest;
        else
            rear.next=newest;
        rear=newest;
        size++;
    }
    int dequeue(){
        if(isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }

             int e=front.val;
            front=front.next;
            size=size-1;
            if(isEmpty())
                rear=null;
            return e;


    }
    int first(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return front.val;
    }
    void display(){
        Node h=front;
        while(h!=null){
            System.out.print(h.val+" ");
            h=h.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        QueueLL q=new QueueLL();

        q.enqueue(5);
        q.enqueue(3);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();

    }

}
