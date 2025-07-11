import java.util.ArrayList;

public class MaxNimberInFixedWindow {
	public static void main(String[]args) {
		
		int[] arr = {1,3,-1,-3,5,3,6,7};
		ArrayList<Integer> N = new ArrayList<Integer>();
		int k=3;
		int left=0;
		int right=k-1;
		int max=0;
		
		while(right<arr.length) {
			max=0;
			for(int i=left;i<=right;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			N.add(max);
			left++;
			right++;
		}
		System.out.println(N);
	}

}
