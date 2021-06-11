package Hashing;

import LinkedList.SinglyLinkedList.SingleLinkedList;

public class Chaining {
    int hashTableSize;
    SingleLinkedList hashTable[];

    public Chaining(){
     hashTableSize=10;
     hashTable=new SingleLinkedList[hashTableSize];
     for(int i=0;i<hashTableSize;i++)
         hashTable[i]=new SingleLinkedList();
    }

    public int hashCode(int key){
        return key%hashTableSize;
    }

    public void insert(int element){
        int i=hashCode(element);
        hashTable[i].insertSorted(element);
    }
    public boolean search(int key){
        int i=hashCode(key);
        return hashTable[i].search(key)!=-1;
    }

    public void display(){
        for(int i=0;i<hashTableSize;i++){
            System.out.print("["+i+"]");
            hashTable[i].display();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Chaining c=new Chaining();
        c.insert(54);
        c.insert(78);
        c.insert(64);
        c.insert(92);
        c.insert(34);
        c.insert(86);
        c.display();
        System.out.println(c.search(54));
    }

}
