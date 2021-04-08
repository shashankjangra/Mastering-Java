import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prev = 0;
        int current = 1;
        int next = 0;
        
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(prev + "\t");
                next = prev + current;
                prev = current;
                current = next;
            }
            System.out.println();
        }
    }
}