import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int count = 0;
     int ans = 0;
     while(n2!=0) {
         int n2ld = n2%10;
         int mul = getMultiplication(b, n1, n2ld);
         mul = mul * (int)Math.pow(10,count);
         ans = getAddition(b, mul, ans);
         count++;
         n2 = n2/10;
     }
    // ans = getAddition(10, 2515, 525);
     return ans;
     
 }
 
 public static int getAddition(int b, int n1, int n2) {
     int carry =0;
     int count = 0;
     int sum = 0;
     while(n1!=0 || n2!=0 || carry!=0) {
         
         int n1ld = n1%10;
         int n2ld = n2%10;
         
         int n1ldn2ld = n1ld + n2ld + carry;
         carry = n1ldn2ld / b;
         n1ldn2ld = n1ldn2ld % b;
         
         sum = sum + n1ldn2ld * (int)(Math.pow(10,count)) ;
         n1 = n1/10;
         n2 = n2/10;
         count++;
     }
     return sum;
     
 }
 
 public static int getMultiplication(int b,int n1, int n2) {
     int count = 0;
     int mul = 0;
     int carry = 0;
     int ans = 0;
     while(n1!=0 || carry!=0) {
         int n1ld = n1 % 10;
         n1 = n1/10;
         
         mul = n2 * n1ld + carry;
         
         carry = mul / b;
         mul = mul%b;
         
         ans = ans + (int)(mul * Math.pow(10,count) );
         
         count ++;
     }
     return ans;
 }

}