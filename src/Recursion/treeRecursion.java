package Recursion;

//When a function or a method calls itself more than once within the same function, it is called tree recursion.
public class treeRecursion {
    public void cal(int n){
        if(n>0){
            cal(n-1);
            int k=n*n;
            System.out.println("cal("+n+")");
            System.out.println(k);
            cal(n-1);
        }
    }

    public static void main(String[] args) {
        treeRecursion obj=new treeRecursion();
        obj.cal(3);
    }
}
