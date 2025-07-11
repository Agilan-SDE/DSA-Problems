import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntervalArrayNonRepeating {
	public static boolean NonRepeatedNumbers(int Num) {
		HashSet<Character> M = new HashSet<Character>();
		
		String a = Num+"";
		
			for(int i=0;i<a.length();i++) {
				M.add(a.charAt(i));
			}
			
		if(M.size()==a.length()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> N = new ArrayList<Integer>();
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		if(N1>N2) {
			return;
		}
		
		for(int i=N1;i<=N2;i++) {
			if(NonRepeatedNumbers(i)) {
				N.add(i);
			}
		}
		System.out.println(N);
	}

}

