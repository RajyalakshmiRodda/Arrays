import java.util.*;
public class Access_ele {
  public static void main(String[] args) {
    int[] arr={3,56,34,23,89};
    System.out.println("access element by using index");
    System.out.println(arr[2]);
    System.out.println("access element by using for loop");
    for (int i=0;i<5;i++) {
      System.out.println(arr[i]);
    }
    System.out.println("access element by using for each loop");
    for (int s:arr) {
      System.out.println(s);
    }
  }
}