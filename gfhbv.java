package recursion;

import java.util.Arrays;

public class gfhbv {
	public static void main(String[] args) {
		int n=3;
		char[] arr = new char[n];

        for(char i=1-'1';i<=n;i++){
            arr[i-49] = i;
        }
        
        System.out.println(Arrays.toString(arr));
	}

}
