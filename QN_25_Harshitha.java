/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int rev[]=new int[n];
	    for(int i=0;i<n;i++){
	        rev[n-i-1]=a[i];
	    }
	    System.out.print("enter k:");
	    int k=sc.nextInt();
	    int start=0;
	    int end=k-1;
	    while(start<end){
	        int temp=rev[start];
	        rev[start]=rev[end];
	        rev[end]=temp;
	        start++;
	        end--;
	    }
	    start=k;
	    end=n-1;
	    while(start<end){
	        int temp=rev[start];
	        rev[start]=rev[end];
	        rev[end]=temp;
	        start++;
	        end--;
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(rev[i]);
	    }
    }
}
