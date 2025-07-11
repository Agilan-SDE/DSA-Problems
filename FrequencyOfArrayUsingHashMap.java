import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FrequencyOfArrayUsingHashMap {
	
	public static ArrayList<String> Binary(int[] arr){
		ArrayList<String> N = new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++) {
			N.add(Integer.toBinaryString(arr[i]));
		}
		
		return N;
	}
	public static void Power(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]*2;
		}
	}
	
	public static void main(String[]args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Power(arr);
		
		ArrayList<String> M = Binary(arr);
		System.out.println(M);
		ArrayList<Integer> K = new ArrayList<Integer>();
		
		int j=0;
		
		while(j<M.size()) {
			String a = M.get(j);
			int count=0;
			
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)=='1') {
					count++;
				}
			}
			K.add(count);
			j++;
		}
	
		Collections.sort(K);
		System.out.println(K);
		
		int Mul = K.get(0)*K.get(K.size()-1);
		
		for(int i=1;i<Mul;i++) {
			int pow = (int)Math.pow(2, i);
			
			if(pow>=Mul) {
				System.out.println(pow);
				break;
			}
		}
		
		
	}

}
