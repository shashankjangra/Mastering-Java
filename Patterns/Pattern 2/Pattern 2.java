import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // write ur code here
        int n = input.nextInt();
        
        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}