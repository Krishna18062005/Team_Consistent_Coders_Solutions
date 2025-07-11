import java.util.*;
class Fibanocci{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<=1)
      System.out.print(n);
    else{
      int a=0,b=1;
      for(int i=0;i<n;i++){
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
      }
    }
  }
}
