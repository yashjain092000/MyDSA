package Sorting;

//O(nlogn)
//Stable
//1. sort
//2. merge
//3. divide and conquer
public class mergeSort {

    void sort(int[] a,int left, int right){
        if(left<right){
            int mid=(left+right)/2;
            sort(a,left,mid);
            sort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }
    void merge(int[] a,int left, int mid, int right){
        int i=left,j=mid+1,k=left;
        int[] b=new int[right+1];

        while(i<=mid && j<=right){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
                k++;
            }
            else{
                b[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
            b[k++]=a[i++];
        while(j<=right)
            b[k++]=a[i++];
        for(int index=left;index<=right;index++)
            a[index]=b[index];
    }
    void display(int[] a){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        mergeSort obj=new mergeSort();
        int[] a={5,4,3,2,1};
        obj.display(a);
        obj.sort(a,0,4);
        obj.display(a);
    }
}
