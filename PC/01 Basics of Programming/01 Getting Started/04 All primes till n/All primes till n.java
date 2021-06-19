import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        
        Scanner input = new Scanner(System.in);
        int low = input.nextInt();
        int high = input.nextInt();
        
        for (int i=low; i<=high; i++) {
            int count = 0;
            
            for (int j = 1; j*j<=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count < 2) {
                System.out.println(i);
            }
        }
    }
}