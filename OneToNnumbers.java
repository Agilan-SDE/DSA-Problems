package recursion;

import java.util.ArrayList;

public class OneToNnumbers {
	public static long Sum(long n) {

		if(n<2) {
			return n;
		}
		return Sum(n-1)+Sum(n-2);
	}
	public static void main(String[]args) {
		long n=5;
		System.out.println(Sum(n));
		
		
	}
}
 