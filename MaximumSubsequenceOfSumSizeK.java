import java.util.Arrays;

public class MaximumSubsequenceOfSumSizeK {
	public static void main(String[]args) {
		
		int[] nums = {50,-75};
		int k=2;
		int[] result=new int[k];
		
		int[][] pairs = new int[nums.length][2];
		
		for(int i=0;i<nums.length;i++) {
			pairs[i][0]=nums[i];
			pairs[i][1]=i;
		}
		
		Arrays.sort(pairs,(a,b)->b[0]-a[0]);
		
		int[][] topK = Arrays.copyOfRange(pairs, 0, k);
		
		Arrays.sort(topK,(a,b)->b[1]-a[1]);
		
		for(int i=0;i<topK.length;i++) {
			result[i]=topK[i][0];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
