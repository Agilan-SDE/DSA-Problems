
public class FreqArr {
	public static void main(String[] args) {
		
		int[]  arr = {1,2,3,4,5,6,7,8,9,1,4,2,4,6,2,4,5,2,4,5,2,4,2,1,2,5,1,0};
		
		int max=arr[0];
		
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		
		int[] FreqArr = new int[max+1];
		
		for(int i=0;i<arr.length;i++) {
			FreqArr[arr[i]]++;
		}
		
		for(int i=0;i<FreqArr.length;i++) {
			if(FreqArr[i]>=1) {
			System.out.print(i+" ");
			}
		}
		
		
	}

}
