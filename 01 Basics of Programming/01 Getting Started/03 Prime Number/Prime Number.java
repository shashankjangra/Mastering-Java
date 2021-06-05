import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();

        for (int j = 1; j <= t; j++) {
            int n = scn.nextInt();
            int factors = 2;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    factors++;
                    break;
                }
            }

            if (factors > 2) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }

    }
}