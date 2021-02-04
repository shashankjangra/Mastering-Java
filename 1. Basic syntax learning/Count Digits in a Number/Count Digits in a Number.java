import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans;
        int ctr = 0;
        while (n>0) {
            ans = n%10;
            n = n/10;
            ctr++;
        }
        System.out.println(ctr);
    }
}