package Sorting;

//O(nlogn)
//Unstable
//1. Initialize a gap variable to n/2.
//2. Scan the array with a diff of gap+i to left and right of i, swap accordingly.
//3. Repeat for gap/=2 until gap>0.
public class shellSort {
    public void sort(int[] a){
        int gap=a.length/2;
        while(gap>0){
            for(int i=0;i<a.length;i++){
                int index=i-gap;
                if(index>=0){
                    if(a[index]>a[i]){
                        int temp=a[i];
                        a[i]=a[index];
                        a[index]=temp;
                    }

                }
                if(index<a.length){
                    if(a[index]<a[i]){
                        int temp=a[i];
                        a[i]=a[index];
                        a[index]=temp;
                    }

                }
            }
            gap/=2;
        }
    }
    void display(int[] a){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        shellSort obj=new shellSort();
        int[] a={5,4,3,2,1};
        obj.display(a);
        obj.sort(a);
        obj.display(a);
    }
}
