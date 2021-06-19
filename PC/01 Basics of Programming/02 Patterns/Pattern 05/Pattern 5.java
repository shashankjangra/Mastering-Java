import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        //Dividing the figure in first half and second half
        int first = n/2 + 1;
        int second = n-first;
        
        //Stars and spaces declaration
        int stars = 1;
        int spaces = n/2;
        
        //first half 
        for(int j=1; j<=first; j++) {
            //spaces
            for(int i=1; i<=spaces; i++) {
                System.out.print("  ");
            }
            
            //stars
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            stars = stars + 2;
            spaces--;
        }
        
        //second half
        spaces = 1;
        stars = n-2;
        
        for(int j=1; j<=second; j++) {
            //spaces
            for(int i=1; i<=spaces; i++) {
                System.out.print("  ");
            }
            
            //stars
            for(int i=1; i<=stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            stars = stars - 2;
            spaces++;
        }
    }
}