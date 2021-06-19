import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int horizontal = n + (n-1);
    int stars = 1;
    int spaces = horizontal - 2;
    
    for(int i=1; i<=n; i++) {
        int num = 1;
        
        //Print Stars
        for(int j=1; j<=stars; j++) {
            System.out.print(num+"\t");
            num++;
        }
        
        //Print Spaces
        for(int j=1; j<=spaces; j++) {
            System.out.print("\t");
        }
        
        if(i==n) {
            stars--;
            num-=2;
        } else {
            num--;
        }
        
        //Print Stars
        for(int j=1; j<=stars; j++) {
            System.out.print(num+"\t");
            num--;
        }
        
        spaces-=2;
        stars++;
        System.out.println();
        
    }

 }
}