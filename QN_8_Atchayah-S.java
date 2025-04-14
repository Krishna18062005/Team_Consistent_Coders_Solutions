import java.util.*;
public class AmstrongNumber{
public static boolean isAmstrong(int num){
    int temp=num,len=0,result=0;
    while(temp>0){
        temp/=10;
        len++;
    }
    temp=num;
    while(temp>0){
        result+=Math.pow(temp%10,len);
        temp/=10;
    }
return (result==num);
}
public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    System.out.println(isAmstrong(num)?num+" is an Armstrong Number": num+" is not an Armstrong Number");
    }
}