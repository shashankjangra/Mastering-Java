import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int temp = n;
    int ans = 0;
    int length = 0;
    //get the length
    while(temp!=0) {
        int tempo = temp % 10;
        temp = temp / 10;
        length++;
    }
    // System.out.println("length "+ length );
    
    for(int i=1; i<=length; i++) {
        // System.out.println("i "+ i);
        int tempo = n % 10;
        // System.out.println("tempo "+ tempo);
        
        ans = ans + ( i * (int)Math.pow(10, tempo-1) );
        // System.out.println("ans "+ ans);
        
        n = n / 10;
        // System.out.println("n "+ n);
        
        // System.out.println();
        // System.out.println();
    }
    System.out.print(ans);
 }
}