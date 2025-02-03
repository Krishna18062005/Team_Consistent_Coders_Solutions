import java.util.*;
public class FibonacciNumbers {
    public static void nSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        System.out.print(n1+" ");
        for(int i=1; i<=n; i++) {
            System.out.print(n2+" ");
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        nSeries(n);
    }
}
