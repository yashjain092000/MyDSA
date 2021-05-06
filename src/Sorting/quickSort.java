package Sorting;

//O(nlogn)
//O(n2)-worst case complexity-when array is sorted
//Unstable
public class quickSort {
    void sort(int[] a,int low, int high){
        if(low<high){
            int pi=partition(a,low, high);
            sort(a,low,pi-1);
            sort(a,pi+1,high);
        }
    }
    int partition(int[] a,int low, int high){
        int pivot=a[low];
        int i=low+1,j=high;
        do{
            while(i<=j && a[i]<=pivot)
                i++;

            while(i<=j && a[j]>pivot)
                j--;

            if(i<=j)
                swap(a,i,j);

        }while (i<j);
        swap(a,low,j);
        return j;
    }
    public void swap(int[] a, int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    void display(int[] a){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        quickSort obj=new quickSort();
        int[] a={5,4,3,2,1};
        obj.display(a);
        obj.sort(a,0,4);
        obj.display(a);
    }
}
