package Searching;

public class linearSearch {
    public int search(int n,int[] a,int key){
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        linearSearch obj=new linearSearch();
        int[] a={5,4,3,2,1};
        System.out.println(obj.search(5,a,4));
    }
}
