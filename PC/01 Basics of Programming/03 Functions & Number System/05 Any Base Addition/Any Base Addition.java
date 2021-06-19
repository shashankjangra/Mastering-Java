import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int carry = 0;
       int sum = 0;
       int count = 0;
       while(n1!=0 || n2!=0 || carry!=0 ) {
            int n1ld = n1 % 10;
            int n2ld = n2 % 10;
            
            n1 = n1/10;
            n2 = n2/10;
            
            int n1ld_n2ld = n1ld + n2ld + carry;
            
            int digit = n1ld_n2ld % b;
            carry = n1ld_n2ld/b;
            
            sum = sum + (int)(digit * Math.pow(10,count));
            count++;
       }
       return sum;
   } 
  }