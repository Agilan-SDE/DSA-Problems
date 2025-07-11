import java.util.Arrays;
//*** The Array Must Be Sorted ***//
public class WaveArray {
	public static void main(String[]args) {
		
		int[] arr = {2,1,4,3,5};//2 1 4 3 5
		Arrays.sort(arr);
		int n=0;
		
		if(arr.length%2==0) {
			n=arr.length;
		}else {
			n=arr.length-1;
		}
		
		for(int i=0;i<n;i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1]  = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
