package Queues;

public class QueueArray {

    private int[] q;
    private int front;
    private int rear;
    private int size;
    QueueArray(int n){
        q=new int[n];
        front=0;
        rear=0;
        size=0;
    }
    int length(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==q.length;
    }
    void enqueue(int val){
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        else {
        q[rear]=val;
        rear++;
        size++;
        }
        }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int e=q[front];
        front++;
        size--;
        return e;

    }
    int first(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return q[front];
    }
    void display(){
        for(int i=front;i<rear;i++)
            System.out.print(q[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        QueueArray q=new QueueArray(3);

        q.enqueue(1);
        q.enqueue(2);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }

    }


