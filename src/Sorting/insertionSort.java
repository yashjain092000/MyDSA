package Sorting;

//O(n2)
// stable
//1.start from index=1.
//2. Scan each element, if its left element is greater, move it(greater one) to its index.
//3. Repeat until greater and index>0

public class insertionSort {
    public void sort(int[] a){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i;
            while(j>0 && a[j-1]>key){
                a[j]=a[j-1];
                j--;
            }
            a[j]=key;
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
