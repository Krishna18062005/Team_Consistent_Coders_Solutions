import java.util.*;
class palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int rev=0;
    while(n>0){
      int dig=n%10;
      rev=(rev*10)+dig;
      n/=10;
    }
    if(rev==temp)
      System.out.print("Palindrome");
    else
      System.out.print("Not Palindrome");
  }
}
