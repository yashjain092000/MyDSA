package Sorting;

import java.util.Arrays;

//O(n2)
//Unstable
public class selectionSort {
    public void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index])
                    index=j;
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }

        }

    }
    void display(int[] a){
        for(int i:a)
        System.out.print(i+" ");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        selectionSort obj=new selectionSort();
        int[] a={5,4,3,2,1};
        obj.display(a);
        obj.sort(a);
        obj.display(a);
    }
}
