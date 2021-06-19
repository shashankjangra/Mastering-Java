import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int ans = n;
        //get the length of n
        int temp = n;
        int lengthOfN = 0;
        while (temp!=0) {
            temp = temp/10;
            lengthOfN++;
        }
        // System.out.println("lengthOfN = " + lengthOfN);
        
        k = k % lengthOfN;
        
        if (k == lengthOfN) {
            System.out.println(ans);
            return;
        } 
        
        if (k < 0) {
            k = k + lengthOfN;
            // System.out.println("k less 0 = " + k);
        } 
        // int a = (int)Math.pow(10,5);
        // System.out.print(a);
        
        int tenk = (int)Math.pow(10,k);
        // System.out.println("tenk = " + tenk);
        
        int tenLen = (int)Math.pow(10,lengthOfN-k);
        // System.out.println("tenLen = " + tenLen);
        
        int a = n % tenk;
        // System.out.println("a tenk = " + a);
        
        a = a * tenLen;
        // System.out.println("a tenLen = " + a);
        
        int div = n / tenk;
        ans = a + div;
        System.out.println(ans);
        
    }
   }