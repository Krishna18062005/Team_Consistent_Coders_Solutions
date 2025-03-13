import java.util.*;
public class Solution {
  public static boolean isPowerOfTwo(int n) {
    return (n>0) && ((n & (n-1)) == 0);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPowerOfTwo(n));
  }
}
