import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    
    //Fill up the array
    for(int i=0; i<n; i++) {
        arr[i] = input.nextInt();
    }
    
    //get max
    int max = arr[0];
    for(int i=0; i<n; i++) {
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    //get min
    int min = arr[0];
    for(int i=0; i<n; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
    }
    
    int ans = max - min;
    System.out.print(ans);
    
 }

}