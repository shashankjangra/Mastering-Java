import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int a1[] = new int[n1];
    
    for(int i=0; i<n1; i++) {
        a1[i] = input.nextInt();
    }
    
    int n2 = input.nextInt();
    int a2[] = new int[n2];
    
    for(int i=0; i<n2; i++) {
        a2[i] = input.nextInt();
    }
    
    // check the bigger array
    int n3 = n1;
    if(n2 > n1) {
        n3 = n2;
    }
    //create ans array
    int a3[] = new int[n3];
    int carry = 0;
    n1--;
    n2--;
    n3--;
    
    //loop to do addition
    while (n1>=0 || n2>=0 || carry>0) {
        int sum = carry;
        
        //check if the value exits then add to sum
        if(n1>=0) {
            sum+=a1[n1];
        }
        
        if(n2>=0) {
            sum+=a2[n2];
        }

        int val = sum % 10;
        carry = sum/10;
        a3[n3] = val;
        n1--;
        n2--;
        n3--;
    }
    
    //print ans
    for(int i=0; i<a3.length; i++) {
        System.out.println(a3[i]);
    }
    
 }

}