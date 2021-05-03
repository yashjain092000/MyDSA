package Recursion;

//when a function calls itself and that call is the last statement in that function, it is called Tail Recursion. No statements after that call.
public class tailRecursion {
    public void cal(int n){
        if(n>0){//base condition
            System.out.println("cal("+n+")");
            System.out.println("|");
            int k=n*n;
            System.out.println(k);
            cal(n-1); // recursive call(last stmt in the function

        }
    }

    public static void main(String[] args) {
        tailRecursion obj=new tailRecursion();
        obj.cal(4);
    }
}
