11. REVERSE STRING

import java.util.*;
class reverse{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char a[]=str.toCharArray();

    int left=0;
    int right=a.length-1;
    while(left<right){
      char temp=a[left];
      a[left]=a[right];
      a[right]=temp;
      left++;
      right--;
    }
    System.out.println(a);
  }
}
