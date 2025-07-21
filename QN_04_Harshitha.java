import java.util.*;
class gcd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int min=0;
    int gcd=0;
    if(a>b)
      min=b;
    else
      min=a;
    for(int i=min;i>=1;i--){
      if(a%i==0 && b%i==0){
        gcd=i;
        break;
      }
    }
    System.out.print(gcd);
  }
}
