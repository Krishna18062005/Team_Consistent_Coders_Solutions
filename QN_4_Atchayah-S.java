import java.util.*;
public class Gcd{
public static int gcd(int num1, int num2){
int result= num1<num2? num1: num2;
while(result>0){
 if(num1%result==0 && num2%result==0)
	break;
result--;
}
return result;
}
public static void main(String args[]){
int num1, num2;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println("GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
}
}