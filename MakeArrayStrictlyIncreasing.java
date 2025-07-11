import java.util.Arrays;

public class MakeArrayStrictlyIncreasing {
	
	public static boolean Arrange(int[] arr1,int[] arr2,int left) {
		int i=0;
		while(i<arr2.length) {
			if(arr1[left-1]<arr2[i]) {
				System.out.println(arr1[left]);
				arr1[left]=arr2[i];
				return true;
			}
			
			i++;
		}
		return false;
	}
	public static int Solution(int[] arr1,int[] arr2) {
		int left=0;
		int right=1;
		int count=0;
		
		while(right<arr1.length) {
			
			if(arr1[left]>=arr1[right]) {
				System.out.println(left);
				if(Arrange(arr1,arr2,left)) {
				count++;
				}
			}
			
			left++;
			right++;
			
		}
		
		if(count!=0) {
			return count;
		}
		return -1;
	}
	public static void main(String[]args) {
		int[] arr1 = {1,5,3,6,7};
		int[] arr2 = {4,3,1};
		Arrays.sort(arr2);
		int a = Solution(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(a);
	}

}
