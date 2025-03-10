import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
	public static boolean anagramCheck(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        String s1=scan.next();
	        String s2=scan.next();
	        
	    boolean a=anagramCheck(s1, s2);
	   System.out.println(a);
	   scan.close();
	  }

	
}
