import java.util.Scanner;
public class IntegerToWords {
	public static String NumberToDigitHelper(int num) {
		if(num==0) {
			return "Zero";
		}
		String result = NumbertoDigit(num%1000);
		
		num=num/1000;
		
		if(num>0 && num%1000>0) {
			result = NumbertoDigit(num%1000)+" Thousand "+result;
		}
		num=num/1000;
		if(num>0 && num%1000>0) {
			result = NumbertoDigit(num%1000)+" Million "+result;
		}
		num=num/1000;
		if(num>0) {
			result= NumbertoDigit(num%1000)+" Billion "+result;
		}
		return result;
		
	}
	
	public static String NumbertoDigit(int num) {
		String[] digitString = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] teenString = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tenString = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String result = "";
		
		if(num>99) {
			result += digitString[num/100]+" Hundred ";
		}
		num=num%100;
		
		if(num>19) {
			result+=tenString[num/10]+" ";
		}
			if(num<20 && num>9) {
				result += teenString[num%10]+" ";
			}
			num=num%10;
			if(num>0) {
				result+=digitString[num];
			}
		
		return result;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(NumberToDigitHelper(num));;
		
	}
}
