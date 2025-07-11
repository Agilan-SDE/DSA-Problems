import java.util.Arrays;

public class MergeSort {

	public static void MergeSort(int[] arr,int left,int right) {
		
		if(left>=right) {
			return;
		}
		int mid = (left+right)/2;
		
		MergeSort(arr,left,mid);
		MergeSort(arr,mid+1,right);
		
		int LeftStartingArray=left;
		int RightStartingArray = mid+1;
		
		int[] LeftHalf = new int[mid-left+1];
		int[] RightHalf = new int[right-mid];
		
		for(int i=0;i<LeftHalf.length;i++) {
			LeftHalf[i] = arr[LeftStartingArray+i];
		}
		for(int i=0;i<RightHalf.length;i++) {
			RightHalf[i] = arr[RightStartingArray+i];
		}
		
		int index=left;
		int p1=0;
		int p2=0;
		
		while(p1<LeftHalf.length && p2<RightHalf.length) {
			if(LeftHalf[p1]<RightHalf[p2]) {
				arr[index++] = LeftHalf[p1];
				p1++;
			}
			else {
				arr[index++] = RightHalf[p2];
				p2++;
			}
		}
		
		while(p1<LeftHalf.length) {
			arr[index++]=LeftHalf[p1];
			p1++;
		}
		while(p2<RightHalf.length) {
			arr[index++]=RightHalf[p2];
			p2++;
		}
	}
	public static void main(String[]args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		int left=0;
		int right=arr.length-1;
		MergeSort(arr,left,right);
		System.out.println(Arrays.toString(arr));
	}
}
