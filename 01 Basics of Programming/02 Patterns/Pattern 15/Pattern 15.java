import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int spaces = n/2 +1;
        int stars = 1;
        int num = 1;
        
        for(int i=1; i<=n; i++) {
            
            //Front Spaces
            for(int j=1; j<spaces; j++) {
                System.out.print("\t");
            }
            
            //where to print
            int numCopy = num;
            for(int j=1; j<=stars; j++) {
                System.out.print(numCopy+"\t");
                
                if(j <= (stars/2)) {
                   numCopy++;
                } else {
                    numCopy--;
                }
            }
            
            if(i<n/2+1) {
                spaces--;
                stars+=2;
                num++;
            } else {
                spaces++;
                stars-=2;
                num--;
            }
            System.out.println();
        }

    }
}