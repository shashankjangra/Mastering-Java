import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      
      int n1 = num1;
      int n2 = num2;
      
      while(n2%n1 != 0){
        int rem = n2 % n1;
        n2 = n1;
        n1 = rem;
      }
      System.out.println(n1);
      int lcm = (num1 * num2) / n1;
      System.out.println(lcm);
     }
    } 