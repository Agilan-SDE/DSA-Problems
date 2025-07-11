import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
public class Revision {
	public static void main(String[]args) {

		int[] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,9,10}; 
		
		HashMap<Integer,Integer> N = new HashMap<Integer,Integer>();
		
		for(int i:arr) {
			N.put(i, N.getOrDefault(i,0)+1);
		}
		
		System.out.println(N);
		
		ArrayList<Integer> M = new ArrayList<Integer>();
		
		for(int i:N.keySet()) {
			
		}
		
	}
}
