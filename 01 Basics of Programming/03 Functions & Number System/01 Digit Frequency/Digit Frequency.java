import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int temp = n;
        int count = 0;
        while(temp!=0) {
            int rem = temp%10;
            temp = temp/10;
            
            if(rem==d) {
                count++;
            }
        }
        return count;
    }
}