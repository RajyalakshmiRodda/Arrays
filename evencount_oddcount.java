import java.util.*;
public class evencount_oddcount {
  public static void main(String[] args) {
    int[] p={23,43,89,12,53,46,15,20};
    int counte=0,counto=0;
    for (int i=0;i<=7;i++) {
      if (p[i]%2==0) {
        counte++;
      }
      else {
        counto++;
      }
    }
    System.out.println("even elements");
    System.out.println(counte);
    System.out.println("odd elements");
    System.out.println(counto);
  }
}