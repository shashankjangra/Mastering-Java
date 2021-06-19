import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int outerSpaces = n/2;
        int innerSpaces = -1;
        
        for(int i=1; i<=n; i++) {
            
            //Printing OuterSpaces
            for(int j=1; j<=outerSpaces; j++) {
                System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            //Printing InnerSpaces
            for(int j=1; j<=innerSpaces; j++) {
                System.out.print("\t");
            }
            
            if(i>1 && i<n) {
                System.out.print("*");
            }
            
            if(i<=n/2) {
                outerSpaces--;
                innerSpaces+=2;
            } else {
                outerSpaces++;
                innerSpaces-=2;
            }
            
            System.out.println();
        }
    }
}