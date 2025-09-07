import java.util.*;
class count{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sol=0;
    while(n>0){
      int dig=n%10;
      sol+=1;
      n/=10;
    }
    System.out.print(sol);
  }
}


