import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int m = 2;
  while (n!=1){
    if(n%m == 0) {
        n = n/m;
        System.out.print(m+" ");
    } else {
        m++;
    }
  }
 }
}