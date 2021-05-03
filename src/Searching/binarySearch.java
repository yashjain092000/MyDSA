package Searching;

public class binarySearch {
    public int bSearchIterative(int[] a, int key){
        int n=a.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid= (int) Math.floor((left+right)/2);
            if(a[mid]==key)
                return mid;
            if(key<a[mid])
                right=mid-1;
            else if(key>a[mid])
                left=mid+1;
        }
        return -1;
    }
    public int bSearchRecursive(int[] a,int key,int left,int right){
        if(left>right)
            return -1;
        else{
            int mid= (int) Math.floor((left+right)/2);
            if(key==a[mid])
                return mid;
            if(key<a[mid])
                return bSearchRecursive(a,key,left,mid-1);
            if(key>a[mid])
                return bSearchRecursive(a,key,mid+1,right);
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        binarySearch obj=new binarySearch();
        System.out.println(obj.bSearchIterative(a,4));
        System.out.println(obj.bSearchRecursive(a,4,0,4));
    }
}
