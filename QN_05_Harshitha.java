import java.util.*;
class count{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sol;
    if(n==0)
      sol=0;
    else if(n%9==0)
      sol=9;
    else
      sol=n%9;
    System.out.print(sol);
  }
}


