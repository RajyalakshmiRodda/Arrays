import java.util.*;
public class Methods_array {
  public static void main(String[] args) {
    int[] p={4,6,32,89,12};
    int[] q={5,78,34,23,90};
    System.out.println(p);
    System.out.println("by using tostring method");
    System.out.println(Arrays.toString(p));
    Arrays.sort(p);
    System.out.println("by using sort method");
    System.out.println(Arrays.toString(p));
    System.out.println("by using binary search method");
    System.out.println(Arrays.binarySearch(p,32));
    System.out.println("by using copy of method");
    System.out.println(Arrays.toString(Arrays.copyOf(p,9)));
    System.out.println("by using copyof range method");
    System.out.println(Arrays.toString(Arrays.copyOfRange(p,2,5)));
    Arrays.fill(p,56);
    System.out.println("by using fill method");
    System.out.println(Arrays.toString(p));
    System.out.println("by using equals method");
    System.out.println(Arrays.equals(p,q));
    Integer a[]={3,5,7,9};
    List<Integer> b=Arrays.asList(a);
    System.out.println("by using aslist method");
    System.out.println(b);
    int[] c={56};
    System.out.println("by using hashcode method");
    System.out.println(Arrays.hashCode(c));  
}
}