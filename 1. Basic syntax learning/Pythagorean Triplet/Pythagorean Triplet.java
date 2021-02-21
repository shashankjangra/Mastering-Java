import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner input = new Scanner(System.in);
    //Input all numbers
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    if (a*a == b*b + c*c) {
        System.out.print("true");
    } else if (b*b == c*c + a*a){
        System.out.print("true");
    } else if (c*c == a*a + b*b) {
        System.out.print("true");
    } else {
        System.out.print("false");
    }
   }
  }