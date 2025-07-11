package recursion;

import java.util.Scanner;

public class PrintPermutationOfAString {
	public static void permutations(char[] arr ,int fi) {
		int count=0;
		if(fi==arr.length-1) {
			count++;
			System.out.println(arr);
			return;
		}
		
		for(int i=fi;i<arr.length;i++) {
			
			swap(arr,i,fi);
			permutations(arr,fi+1);
			swap(arr,i,fi);
		}
	}
	
	public static void swap(char[] arr,int i,int fi) {
		char temp=arr[i];
		arr[i]=arr[fi];
		arr[fi]=temp;
	}
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		permutations(a.toCharArray(),0);
		
	}

}
