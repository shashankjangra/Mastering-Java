import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int decimal = anyBaseToAnyDecimal(n, sourceBase);
     int ans = decimalToAnyBase(decimal, destBase);
     System.out.print(ans);
   }
   
   public static int anyBaseToAnyDecimal(int n, int source) {
       int count = 0;
       int sum = 0;
       
       while(n!=0) {
           int rem = n%10;
           n = n/10;
           
           sum = sum + (int)(rem * Math.pow(source,count) );
           count++;
       }
       return sum;
   } 
   
   public static int decimalToAnyBase(int n, int dest) {
       int count = 0;
       int sum = 0;
       
       while(n!=0) {
           int rem = n % dest;
           n = n/dest;
           
           sum = sum + (int)(rem * Math.pow(10, count) );
           count++;
       }
       return sum;
   }
   
  }