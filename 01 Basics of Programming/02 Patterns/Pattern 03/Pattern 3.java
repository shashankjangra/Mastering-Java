import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // write ur code here
        int n = input.nextInt();
        int stars = 1;
        int spaces = n-1;
        for (int i=0; i<n; i++) {
            for (int j=1; j<=spaces; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=stars; j++) {
                System.out.print("              ");
            }
            System.out.println();
            stars++;
            spaces--;
        }
    }
}