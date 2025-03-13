import java.util.*;
public class PrimeNumberChecker {
    public static boolean isPrime(int n) {
        if(n == 1 || n == 0) {
            return false;
        }else if(n == 2) {
            return true;
        }
        int c = 1;
        for(int i=2; i<=n/2; i++) {
            if(n %% i == 0) {
                c = 0;
            }
        }
        if(c == 1) {
            return true;
        }else {
            return false;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n+" is prime number");
        }else {
            System.out.println(n+" is not prime number");
        }
    }
}
