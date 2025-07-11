import java.util.ArrayList;     //Longest Subarray With Sum K // refer gfg
import java.util.HashMap;
//Given an array arr[] of size n containing integers, the task is to find the length of the longest subarray having sum equal to the given value k.
//
//Note: If there is no subarray with sum equal to k, return 0.
//
//Examples: 
//
//Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
//Output: 6
//Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
//
//Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
//Output: 5
//Explanation: Only subarray with sum = 15 is [-5, 8, -14, 2, 4] of length 5.
//
//Input: arr[] = [10, -10, 20, 30], k = 5
//Output: 0
//Explanation: No subarray with sum = 5 is present in arr[].
public class LongestSubArrayWithSumK {
	
	public static int LongestSumKey(int[] arr,int k) {
		
		ArrayList<Integer> N = new ArrayList<Integer>();
		int Sum=0;
		int Count=0;
		
		for(int i=0;i<arr.length;i++) {
			Sum+=arr[i];
			
			if(Sum==k) {
				N.add(i);
			}
		}
		if(N.size()>0) {
			return (N.get(N.size()-1)+1);
		}
			return 0;

	}
	public static void main(String[]args) {
		
		int[] arr = {10, -10, 20, 30};
		int k=5;
		
		System.out.println(LongestSumKey(arr,k));
	}

}
