package Heaps;

import java.util.Arrays;

public class Heap {
    private int mSize;
    private int cSize;
    private int[] data;
    Heap(int mSize){
        this.mSize=mSize;
        cSize=1;
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
        while(hi>1 && e>data[(int)Math.floor(hi/2)]){
            data[hi]=data[(int)Math.floor(hi/2)];
            hi=(int)Math.floor(hi/2);
            hi=hi/2;
        }
        data[hi]=e;
    }
}
