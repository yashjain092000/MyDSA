package Stacks;

public class StackLL {
    class Node{
        int val;
        Node next;
        Node(int value){
            val=value;
            next=null;
        }
    }
    Node top;
    int size;
    StackLL(){
        top=null;
        size=0;
    }
    int length(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    void push(int e){
        Node newest=new Node(e);
        if(!isEmpty())
            newest.next=top;
        top=newest;
        size++;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        else{
            int e=top.val;
            top=top.next;
            size--;
            return e;
        }

    }
    int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return top.val;
    }
    void display(){
        Node cur=top;
        while(cur!=null){
            System.out.print(cur.val+"-");
            cur=cur.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        StackLL s=new StackLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        s.display();
        s.push(4);
        s.display();
    }
}
