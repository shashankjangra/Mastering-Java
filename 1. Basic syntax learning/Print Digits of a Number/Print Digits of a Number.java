import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int ncopy = n;
        int ans;
        int nodigits = 0;
        while (n>0) {
            ans = n%10;
            n = n/10;
            nodigits++;
        }
        
        int div = (int)(Math.pow(10, nodigits-1));
        
        while(div>0) {
            ans = ncopy/div;
            System.out.println(ans);
            ncopy = ncopy%div;
            div = div/10;
        }
    }
}