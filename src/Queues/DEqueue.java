package Queues;


public class DEqueue {
    


        public class Node {
            int val;
            Node next;
            Node(int val, Node next) {
                this.val=val;
                this.next=next;
            }
        }

        private Node front;
        private Node rear;
        private int size;

        public DEqueue(){
            front=null;
            rear=null;
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
                front=newest;
            else
                rear.next=newest;

            rear=newest;
            size++;
        }

        public void display(){
            Node cur=front;
            while(cur!=null){
                System.out.print(cur.val+"-->");
                cur=cur.next;
            }
            System.out.println(" ");
        }

        public void addFirst(int value){
            Node newest=new Node(value,null);
            if(isEmpty()){
                front=newest;
                rear=newest;
            }
            else{
                newest.next=front;
                front=newest;
            }
            size++;
        }


        public int deleteFirst(){
            if(isEmpty()){
                System.out.println("List is Empty");
                return -1;
            }
            int deletedElement=front.val;
            front=front.next;
            size--;
            if(isEmpty())
                rear=null;
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
            Node cur=front;
            while(index<size-1){
                cur=cur.next;
                index++;
            }
            rear=cur;
            int deletedElement=cur.next.val;
            rear.next=null;
            size--;
            return deletedElement;
        }

        public int search(int key){
            int index=1;
            Node cur=front;
            while(index<=size){
                if(cur.val==key)
                    return index;
                cur=cur.next;
                index++;
            }
            return -1;
        }


        public static void main(String[] args) {
          DEqueue l=new DEqueue();
            l.addLast(1);
            l.addLast(2);
            l.addLast(3);
            l .display();
            l.addFirst(0);
            l.display();
            l.deleteFirst();
            l.display();
            l.deleteLast();
            l.display();


        }
    }


