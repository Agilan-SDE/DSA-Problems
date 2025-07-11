import java.util.ArrayList;

public class SubarraySumEqualToN {
	public static void main(String[]args) {
		
		ArrayList<ArrayList<Integer>> N = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> M = new ArrayList<Integer>();
		
		int[] arr = {3,4,-7,1,3,3,1,-4};
		int target=7;
		
		int left=0,right=0,Sum=0;
		
		while(right<arr.length) {
			
			if(Sum==target) {
				for(int i=left;i<right;i++) {
					M.add(arr[i]);
				}
				N.add(M);
				M=new ArrayList<Integer>();
			}
			
			Sum+=arr[right];
			
			while(Sum>target) {
				Sum-=arr[left];
				left++;
			}
			right++;
		}
		System.out.println(N);
		
	}

}
