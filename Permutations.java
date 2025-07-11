package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
	public static void swap(char[] arr ,int fi,int i) {
		
		char temp=arr[fi];
		arr[fi]=arr[i];
		arr[i]=temp;
	}
	public static void permutations(char[] arr,int fi,List<List<Character>> N) {
		
		if(fi==arr.length) {
			List<Character> M = new ArrayList<>();
			
			for(char i:arr) {
				M.add(i);
			}
			N.add(M);
			return;
		}
		for(int i=fi;i<arr.length;i++) {
			swap(arr,fi,i);
			permutations(arr,fi+1,N);
			swap(arr,fi,i);
		}
	}
	public static void main(String[] args) {
		List<List<Character>> N = new ArrayList<>();
		String a = "ABCDE";
		permutations(a.toCharArray(),0,N);
		
		System.out.println(N);
		
	}

}
