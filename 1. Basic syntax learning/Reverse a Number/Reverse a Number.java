import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rem;
        while(n>0) {
            rem = n%10;
            System.out.println(rem);
            n = n/10;
        }
    }
}