import java.util.Arrays;

public class OneDArrayToTwoDArray {
	public static void main(String[]args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int N=3;
		int M=3;
		int[][] arr1 = new int[N][M];
		
		
		int j=0;
		int k=0;
		while(k<N) {
			
			for(int i=0;i<M;i++) {
				arr1[k][i]=arr[j++];
			}
			k++;
		}
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int c=0;c<arr1[0].length;c++) {
				System.out.print(arr1[i][c]+" ");
			}
			System.out.println();
		}
	}

}
