import java.util.Arrays;

public class SlisingWindowMedian {
	public static void main(String[]args) {
		
		int[] nums = {1,4,2,3};
		int k=4;
		  double[] arr = new double[nums.length-k+1];
			int left=0;
			int right=k-1;
			int index=0;
			while(right<nums.length) {
				
				int[] sort = Arrays.stream(nums,left,right+1).sorted().toArray();
				
				System.out.println(Arrays.toString(sort));
				if(sort.length%2==0) {
					
					int mid1=sort.length/2;
					
					arr[index++]=(double)(sort[mid1])/2+(double)(sort[mid1-1])/2;
				}
				else {
					int mid=(sort.length/2);
					arr[index++]=sort[mid];
				}
				left++;
				right++;
			}
		
		System.out.println(Arrays.toString(arr));
	}

}
