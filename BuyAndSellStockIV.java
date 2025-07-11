import java.util.ArrayList;
import java.util.Collections;

public class BuyAndSellStockIV {
	public static void main(String[]args) {
		
		int[] prices = {3,3,5,0,0,3,1,4};
		int k=2;
		 ArrayList<Integer> N = new ArrayList<Integer>();
		 
	        int left=0;
	        int right=1;

	        while(right<prices.length){

	            N.add(prices[right]-prices[left]);
	            left++;
	            right++;
	        }
	        Collections.sort(N);
	        
	        System.out.println(N);

	        int Sum=0;
	        if(k<N.size()) {
	        	
	        	for(int j=N.size()-1;j>=0;j--) {
	        		if(N.get(j)<0) {
	        			break;
	        		}
	        		Sum+=N.get(j);
	        		
	        	}
	        }
	        else {
	        	System.out.println(N.get(0));
	        }
	        System.out.println(Sum);
	}

}
