import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int spaces = 1;
        int stars = n/2+1;
        
        int first_half = n/2 + 1;
        int second_half = n/2;
        
        for(int j=1; j<=first_half; j++) {
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            
            for(int i=1; i<=spaces; i++) {
                System.out.print("  ");
            }
            
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            
            stars--;
            spaces = spaces + 2;
            System.out.println();
        }
        
        spaces = n-2;
        stars = 2;
        
        for(int j=1; j<=second_half; j++) {
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            
            for(int i=1; i<=spaces; i++) {
                System.out.print("  ");
            }
            
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            
            stars++;
            spaces = spaces - 2;
            System.out.println();
        }
    }
}