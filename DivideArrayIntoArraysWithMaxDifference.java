import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArraysWithMaxDifference {
	public static List<List<Integer>> Sum(int[] arr,int k){
		List<List<Integer>> N = new ArrayList<>();
		
		for(int i=0;i<arr.length;i+=3) {
			if(i+2 >= arr.length || arr[i+2]-arr[i]>k) {
				return new ArrayList<>();
			}
			N.add(Arrays.asList(arr[i],arr[i+1],arr[i+2]));
		}
		return N;
		
	}
	public static void main(String[]args) {
		
		int[] arr = {2,4,2,2,5,2};
		int k=2;
		
		Arrays.sort(arr);
		
		System.out.println(Sum(arr,k));
	}

}
