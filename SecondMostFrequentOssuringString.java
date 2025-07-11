import java.util.HashMap;

public class SecondMostFrequentOssuringString {
	public static void main(String[]args) {
		
		HashMap<String,Integer> N = new HashMap<String,Integer>();
		String[] arr = {"aaa","bbb","ccc","bbb","aaa","aaa"};
		
		for(String i:arr) {
			N.put(i,N.getOrDefault(i, 0)+1);
		}
		System.out.println(N);
		
		int FirstMax=0;
		int SecondMax=0;
		String SecondFrequent="";
		
		for(String i:N.keySet()) {
			if(FirstMax<N.get(i)) {
				FirstMax=N.get(i);
			}
			if(SecondMax<N.get(i) && FirstMax!=N.get(i)) {
				SecondFrequent=i;
				SecondMax=N.get(i);
			}
		}
		System.out.println(SecondFrequent+" : "+SecondMax);
	}

}
