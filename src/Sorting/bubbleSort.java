package Sorting;

//O(n2)
// Stable
//1. Scan from 0 to n-i-1 index.
//2. If next index is greater, swap.
//3. Repeat
public class bubbleSort {
    public void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
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
