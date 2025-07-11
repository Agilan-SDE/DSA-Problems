import java.util.Arrays;

public class HalfAscendingAndHalfDescending {
	
	public static void main(String[]args) {
		
		int[] arr = {6,5,4,1,2,3};
		int n=arr.length/2;
		for(int i=0;i<arr.length;i++) {
			if(i<n) {
				for(int j=0;j<n;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			if(i>n) {
				for(int j=n;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
