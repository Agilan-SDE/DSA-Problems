import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BitwiseORsOfSubarrays {
	
	public static int BitwiseOR(int[] arr,int left,int right) {
		int Sum=0;
		for(int i=left;i<=right;i++) {
			Sum = Sum|arr[i];
		}
		
		return Sum;
	}
	public static void main(String[]args) {
		
		HashSet<Integer> N = new HashSet<Integer>();
		int[] arr = {1,2,4};
		
		for(int i=0;i<arr.length;i++) {
			N.add(arr[i]);
		}
		
		int k=2;
		int left=0;
		int right=k-1;
		
		while(k<=arr.length) {
			
			N.add(BitwiseOR(arr,left,right));
			left++;
			right++;
			
			if(right==arr.length) {
				k++;
				left=0;
				right=k-1;
			}
		}
		System.out.println(N);
		System.out.println(N.size());
		
	}
}
