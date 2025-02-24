import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){
        int number;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        number=sc.nextInt();
        if((number==0)||(number==1))
        flag=false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
            flag=false;
            break;
            }
        }
        if(flag)
        System.out.println(number+" is a prime number");
        else
        System.out.println(number+" is not a prime number");
    }
}
