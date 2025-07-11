import java.util.HashMap;
import java.util.Scanner;

public class SuperAsciiString {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> N = new HashMap<Character,Integer>();
		
		String a = sc.next();
		
		for(char i:a.toCharArray()) {
			N.put(i, N.getOrDefault(i, 0)+1);
		}
		//abbcccddddeeeeeffffffggggggghhhhhhhhiiiiiiiiijjjjjjjjjjkkkkkkkkkkk
		System.out.println(N);
		int count=0;
		for(char i:N.keySet()) {
			if(!(N.get(i)==i-96)) {
				count++;
			}
		}
		if(count==0) {
		System.out.println("it is super ascii string");
		}
		else {
			System.out.println("It is not super ascii string");
		}
	}

}
