import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++) {
        arr[i] = input.nextInt();
    }
    
    int d = input.nextInt();
    int ans = -1;
    
    for(int i=0; i<n; i++) {
        if(d == arr[i]) {
            ans = i;
            break;
        }
    }
    System.out.print(ans);
 }

}