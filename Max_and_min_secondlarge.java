import java.util.*;
public class Max_and_min_secondlarge {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[6];
    a[0]=23;
    a[1]=12;
    a[2]=4;
    a[3]=34;
    a[4]=2;
    a[5]=54;
    Arrays.sort(a);
     System.out.println("minimum element");
    System.out.println(a[0]);
     System.out.println("maximum element");
     System.out.println(a[5]);
    System.out.println("second largest element");
    System.out.println(a[4]);
  }
}