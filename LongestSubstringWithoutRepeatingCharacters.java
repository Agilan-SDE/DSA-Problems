import java.util.HashSet;
                                 //**VARIABLE SIZE SLIDING WINDOW APPROACH**//
public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[]args) {
		
		HashSet<Character> N = new HashSet<Character>();
		String a = "abcbadefghiab";
		int MaxSubSize = Integer.MIN_VALUE;
		int start=0;
		int end=0;
		
		while(end<=a.length()-1) {
			
			char c = a.charAt(end);
			
			while(N.contains(c)) {
				N.remove(a.charAt(start));
				start++;
			}
			
			N.add(c);
			
			
			int windowSize=end-start+1;
			MaxSubSize = Math.max(windowSize, MaxSubSize);
			end++;
			

		}
		System.out.println(MaxSubSize);
	}

}
