import java.util.*;
class prime{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    boolean flag=false;
    int num=sc.nextInt();
    if(num<=1)
      flag=true;
    else{
      for(int i=2;i<num;i++)
        if(num%i==0)
          flag=true;
    }
    if(!flag)
      System.out.print("True");
    else
      System.out.print("False");
  }
}
