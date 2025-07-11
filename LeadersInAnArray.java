import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
	public static void main(String[]args) {
		ArrayList<Integer> N = new ArrayList<Integer>();
		
		int[] arr = {16, 17, 4, 3, 5, 2};
		int n = arr.length;
		int maxRight=arr[n-1];
		N.add(maxRight);
		
		for(int i=n-2;i>=0;i--) {
			if(maxRight<arr[i]) {
				maxRight=arr[i];
				N.add(maxRight);
			}
		}
		
		Collections.sort(N,Collections.reverseOrder());
		
		System.out.println(N);
	}

}
