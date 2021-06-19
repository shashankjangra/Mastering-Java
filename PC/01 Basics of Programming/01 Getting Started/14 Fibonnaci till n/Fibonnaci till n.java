import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int a = 0;
        int b = 1;
        int ans = 1;
        
        while (n!=0) {
            System.out.println(a);
            ans = a + b;
            a = b;
            b = ans;
            n--;
        }
    }
}