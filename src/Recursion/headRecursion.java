package Recursion;

//When a function calls itself and that call is the first statement if the function, it is called Head Recursion. No statements before that recursive call.
public class headRecursion {
    public void cal(int n){
        if(n>0){
            cal(n-1);
            int k=n*n;
            System.out.println("cal("+n+")");
            System.out.println("|");
            System.out.println(k);
        }

    }

    public static void main(String[] args) {
        headRecursion obj=new headRecursion();
        obj.cal(4);
    }
}
