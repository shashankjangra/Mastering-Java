import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       
       int diff = 0;
       int count = 0;
       int carry = 0;
       while(n2!=0) {
           //ld means last digit
           int n2ld = n2 % 10;
           int n1ld = n1 % 10;
           
           int digit = n2ld - n1ld + carry;
           
           if(digit < 0) {
               digit = digit + b;
               carry = -1;
           } else {
               carry = 0;
           }
           
           diff = diff + (int)( digit * (Math.pow(10,count)));
           count++;
           n2 = n2/10;
           n1 = n1/10;
       }
       return diff;
   }
  
  }