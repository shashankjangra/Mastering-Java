import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    for(int i=1; i*i<=n; i++) {
        System.out.println(i*i);
    }
   }
  }