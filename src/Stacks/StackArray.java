package Stacks;

public class StackArray {
    private int[] data;
    int top;
    StackArray(int n){
        data=new int[n];
        top=0;
    }
    int length() {
        return top;
    }
    boolean isEmpty(){
        return top==0;
    }
    boolean isFull(){
        return top==data.length;
    }
    void push(int e){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
            data[top]=e;
            top++;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int e = data[top - 1];
            top--;
            return e;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        else{
            return data[top-1];
        }
    }
    void display(){
        for(int i=top-1;i>-1;i--)
            System.out.print(data[i]+"-");
        System.out.println("");
    }

    public static void main(String[] args) {
        StackArray s=new StackArray(5);
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
