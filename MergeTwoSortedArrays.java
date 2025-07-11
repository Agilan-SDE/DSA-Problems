import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[]args) {
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		int[] arr = new int[arr1.length+arr2.length];
		
		int i=0;
		int left1=0;
		int left2=0;
		
		while(left1<arr1.length && left2<arr2.length) {
			if(arr1[left1] < arr2[left2]) {
				arr[i++] = arr1[left1];
				left1++;
			}
			else {
				arr[i++] = arr2[left2];
				left2++;
			}
		}
		
		while(left1<arr1.length) {
			arr[i++] = arr1[left1];
			left1++;
		}
		
		while(left2<arr2.length) {
			arr[i++] = arr2[left2];
			left2++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
