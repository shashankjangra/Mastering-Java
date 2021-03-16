import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int stars = n;
        int spaces = 0;
        
        //print stars
        for(int j=0; j<=n; j++) {
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            
            System.out.println();
            
            //print spaces
            for(int i=0; i<=spaces; i++) {
                System.out.print("  ");
            }
            stars--;
            spaces++;
        }
    }
}