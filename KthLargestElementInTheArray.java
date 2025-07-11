import java.util.PriorityQueue;

public class KthLargestElementInTheArray {
public static void main(String[] args) {
		
		PriorityQueue<Integer> N = new PriorityQueue<>();
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
		int k=3;
		
		for(int i:nums) {
			
			N.offer(i);
			
			if(N.size()>k) {
				N.poll();
			}
		}
		
		System.out.println(N.peek());
	}

}
