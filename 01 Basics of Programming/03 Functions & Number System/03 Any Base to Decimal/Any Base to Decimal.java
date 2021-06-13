import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int power = 0;
      int sum = 0;
      
      while(n>0) {
        int rem = n % 10;
        n = (int)n/10;
        
        sum = sum + (int)(rem * Math.pow(b,power) );
        power++;
      }
      return sum;
      
   }
  }