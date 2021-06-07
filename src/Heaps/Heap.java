package Heaps;

import java.util.Arrays;

public class Heap {
    private int mSize;
    private int cSize;
    private int[] data;
    Heap(){
        mSize=10;
        cSize=0;
        data=new int[mSize];
        Arrays.fill(data,0,mSize-1,-1);
    }
    public int length(){
        return cSize;
    }
    public boolean isEmpty(){
        return cSize==0;
    }
    public boolean isFull(){
        return cSize==mSize;
    }
    void insert(int e){
        if(isFull()){
            System.out.println("Heap is Full");
            return;
        }
        cSize++;
        int hi=cSize;
        while(hi>1 && e>data[hi/2]){
            data[hi]=data[hi/2];
            hi=hi/2;
        }
        data[hi]=e;
    }
    public int max(){
        if(isEmpty()){
            System.out.println("Heap is Empty");
            return -1;
            }
        return data[1];
    }
    public void display(){
        for(int i=1;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
    }
    public int deleteMax(){
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }
        int deletedElement=data[1];
        data[1]=data[cSize];
        data[cSize]=-1;
        cSize--;
        int i=1,j=i*2;
        while(j<=cSize){
            if(data[j]<data[j+1])
                j++;
            if(data[i]<data[j]){
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                i=j;
                j=i*2;
            }
            else
                break;
        }
        return deletedElement;
    }

    public static void main(String[] args) {
        Heap h=new Heap();
        h.insert(25);
        h.insert(14);
        h.insert(2);
        h.insert(20);
        h.insert(10);
        h.display();
        System.out.println(h.deleteMax());
        System.out.println(h.deleteMax());

    }
}
