import java.util.*;
public class Reverse_array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
    int s=sc.nextInt();
    int[] r=new int[s];
     System.out.println("enter the elements");
     for (int i=0;i<s;i++) {
       r[i]=sc.nextInt();    
        }
    int[] p=new int[s];
    int j=s-1;
    for (int i=0;i<s;i++) {
       p[j]=r[i]; 
      j-=1;
        }
     System.out.println("reverse the array elements");
    for (int i=0;i<s;i++) {
    System.out.println(p[i]);
    }
}
}