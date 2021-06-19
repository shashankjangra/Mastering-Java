import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int spaces = n/2;
        int stars = 1;
        int mid = n/2 + 1;
        for(int i=1; i<=n; i++) {
            
            if(i!=mid) {
                //Print Spaces
                for(int j=1; j<=spaces; j++) {
                    System.out.print("	");
                }
            }
            
            if(i==mid) {
                for(int j=1; j<=spaces; j++) {
                    System.out.print("*	");
                }
            }
            
            //Print Stars
            for(int j=1; j<=stars; j++) {
                System.out.print("*	");
            }
            
            if(i<mid) {
                stars++;
            } else {
                stars--;
            }
            
            System.out.println();
            
        }

    }
}