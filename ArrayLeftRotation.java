import java.util.Arrays;

public class ArrayLeftRotation {

	static int[] Rotate(int[] arr , int d) {
		
		int n=arr.length;
		if(d>n) {
			d=d%n;
		}
	
		
		reverse(arr,0,d-1);
		
		reverse(arr,d,n-1);
		
		reverse(arr,0,n-1);
		
		
		return arr;
	}
	
	static void reverse(int[] arr,int left,int right) {
		
		while(left<=right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		int d=3;
		
		int[] arr1 = Rotate(arr,d);
		
		System.out.println(Arrays.toString(arr1));

	}

}
