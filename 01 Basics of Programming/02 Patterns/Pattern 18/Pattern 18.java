import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    int spaces = 0;
    int stars = n;
    
    for(int i=1; i<=n; i++) {
        
        //Print outerSpaces
        for(int j=1; j<=spaces; j++) {
            System.out.print("\t");
        }
        
        //Print Stars
        for(int j=1; j<=stars; j++) {
            if(i>1 && i< (n/2)+1 && j>1 && j<stars ) {
                System.out.print("\t");    
            } else {
                System.out.print("*\t");    
            }
        }
        
        if(i<= (n/2) ) {
            stars-=2;
            spaces++;
        } else {
            stars+=2;
            spaces--;
        }
        System.out.println();
    }
 }
}