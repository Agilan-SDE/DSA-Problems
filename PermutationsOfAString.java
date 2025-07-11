import java.util.HashMap;

public class PermutationsOfAString {
	public static void main(String[]args) {
		
		
		String a = "hello";
		String b = "ooolleoooleh";

		int WindowSize = 0;
		HashMap<Character,Integer> need = new HashMap<Character,Integer>();
		HashMap<Character,Integer> have = new HashMap<Character,Integer>();
		
		for(char i:a.toCharArray()) {
			need.put(i, need.getOrDefault(i,0)+1);
		}
		
		int start =0;
		int end =0;
		
		while(end<b.length()) {
			
			char c = b.charAt(end);
			
			if(!need.containsKey(c)) {
				end++;
				start=end;
				have.clear();
				continue;
			}
			
			have.put(c, have.getOrDefault(c, 0)+1);
			
			while(have.get(c) > need.get(c)) {
				char StartChar = b.charAt(start);
				have.put(StartChar, have.get(StartChar)-1);
				start++;
			}
			
			WindowSize = end-start+1;
			end++;
			
		}
		if(WindowSize==a.length()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
