import java.util.*;
public class Sum_avg_array {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int[] a={2,5,12,34};
     int sum=0;
     for (int i=0;i<a.length;i++) {
         sum+=a[i];
     }
    System.out.println("sum of the elements");
     System.out.println(sum);
    System.out.println("average of the elements");
    int avg=sum/4;
     System.out.println(avg);
  }
}