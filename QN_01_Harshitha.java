Math-Based Problems
Find the factorial of a number using recursion.


  

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fact(n));
    }
    
    public static int Fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * Fact(n-1);
        }
    }
}



