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



    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        binarySearch obj=new binarySearch();
        System.out.println(obj.bSearchIterative(a,4));
    }
}
