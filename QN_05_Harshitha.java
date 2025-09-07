import java.util.*;
class palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0,temp=n;
    while(n>0){
      int dig=n%10;
      sum=(sum*10)+dig;
      n/=10;
    }
    if(temp==sum)
      System.out.print("Palindrome");
    else
      System.out.print("Not Palindrome");
  }
}
