import java.util.*;
public class PalindromeNumber{
public static void main(String[] args){
int num,temp,rem,rev=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
temp=num;
while(num>0){
rem=num%10;
rev=rev*10+rem;
num/=10;
}
if(temp==rev){
System.out.println(temp+" is a palindrome number.");
}
else{
System.out.println(temp+" is not a palindrome number.");
}
}
}
