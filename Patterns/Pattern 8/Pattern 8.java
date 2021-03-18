import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int stars = 1;
        int spaces = n-1;
        
        for(int j=1; j<=n; j++) {
            for(int i=1; i<=spaces; i++) {
                System.out.print("  ");
            }
            for(int i=1; i<=stars; i++) {
                System.out.println("*   ");
            }
            spaces--;
        }
    }
}