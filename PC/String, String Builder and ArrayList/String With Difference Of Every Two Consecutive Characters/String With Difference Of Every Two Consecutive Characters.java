import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder ans = new StringBuilder();
		int len = str.length();
		for(int i=0; i<len; i++) {
		    if (i+1 >= len) {
		        ans.append(str.charAt(i));
		        break;
		    }
		    char a = str.charAt(i);
		    char b = str.charAt(i+1);
		    ans.append(a);
		    int diff = b - a;
		    ans.append(diff);
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}