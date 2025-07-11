package recursion;

public class CopyString {
	public static String CopyString(String s1,int index) {
		
		if(index==s1.length()) {
			return "";
		}
		return s1.charAt(index)+CopyString(s1,index+1);
	}
	public static void main(String[]args) {
		
		String s1 = "GEEKSFORGEEKS";
		
		int index=0;
		
		String s2 = CopyString(s1,index);
		System.out.println(s2);
	}

}
