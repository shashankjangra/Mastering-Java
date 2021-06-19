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
    int big;
    if(n1 > n2) {
        big = n1+1;
    } else {
        big = n2+1;
    }
    
    int a3[] = new int[big];
    n1--;
    n2--;
    big--;
    int carry = 0;
    while(n1>=0 || n2>=0 || carry>0) {
        
        int sum=carry;
        sum+=n1>=0?a1[n1]:0;
        sum+=n2>=0?a2[n2]:0;
        
        carry = sum / 10;
        a3[big] = sum % 10;
        
        n1--;
        n2--;
        big--;
    }
    
    int i=0;
    while(a3[i]==0){
        i++;
    }
    for(; i<a3.length; i++) {
        System.out.println(a3[i]);    
    }
    
    //031075
    //111111
    //142186
 }

}