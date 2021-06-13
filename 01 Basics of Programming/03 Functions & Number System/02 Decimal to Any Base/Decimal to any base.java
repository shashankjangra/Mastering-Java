import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       
       int sum =0;
       int power = 0;
       while(n!=0) {
           int rem = n % b;
           n = (int)n/b;
           sum = (int)sum + (int)(rem * Math.pow(10,power) );
           power++;
       }
       return sum;
   }
  }