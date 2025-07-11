import java.util.ArrayList;

public class SetMatrixZeroes {
	public static int[][] putZeroes(ArrayList<String> N,int[][] arr) {
		int j=0;
		while(j<N.size()) {
			String Index=N.get(j);
			int row=Index.charAt(0)-48;
			int col=Index.charAt(1)-48;
			
			for(int i=0;i<arr[0].length;i++){
				arr[row][i]=0;//put row zeroes
			}
			
			for(int i=0;i<arr.length;i++){
				arr[i][col]=0;//put col zeroes
			}
			j++;
		}
		return arr;
		
	}
	public static void main(String[]args) {
		int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};//[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
		ArrayList<String> N = new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0) {
					N.add(""+i+j);
				}
			}
		}
		arr=putZeroes(N,arr);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
