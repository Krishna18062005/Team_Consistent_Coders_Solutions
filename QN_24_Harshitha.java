// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                count+=1;
            }
        }
        if(count>0)
        System.out.println("Array contains duplicate values");
        else
        System.out.println("Array doesn't contain any duplicate values");
        
    }
}
