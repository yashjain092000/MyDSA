package Sorting;

import Heaps.Heap;
//O(nlogn)
public class heapSort {
    public void heapSortMethod(int[] a){
    Heap h=new Heap();
    for(int i=0;i<a.length;i++)
        h.insert(a[i]);
    int k=a.length-1;
    for(int i=0;i<a.length;i++){
       a[k]=h.deleteMax();
       k--;
    }

    }
    public  void display(int[] a){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        heapSort s=new heapSort();
        s.heapSortMethod(a);
        s.display(a);
    }
}
