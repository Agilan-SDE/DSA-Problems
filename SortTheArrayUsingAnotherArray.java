import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortTheArrayUsingAnotherArray {
	public static ArrayList<Integer> SortArray(int[] arr1,int[] arr2){
		HashMap<Integer,Integer> M = new HashMap<Integer,Integer>();
		
		ArrayList<Integer> N = new ArrayList<Integer>();
		ArrayList<Integer> O = new ArrayList<Integer>();
		
		for(int num:arr1) {
			M.put(num,M.getOrDefault(num,0)+1);
		}
		
		int j=0;
		while(j<arr2.length) {
			int Freq = arr2[j];
			for(int i=0;i<M.get(Freq);i++) {
				N.add(Freq);
			}
			j++;
		}
		
		for(int i:arr1) {
			if(!(N.contains(i))) {
				O.add(i);
			}
		}
		Collections.sort(O);

		for(int i:O) {
			N.add(i);
		}
		
		return N;
	}
	
	public static void main(String[]args) {
		
		int[] arr1 = {4, 5, 1, 1, 3, 2};
		int[] arr2 = {3, 1};
		
		System.out.println(SortArray(arr1,arr2));
	}

}
