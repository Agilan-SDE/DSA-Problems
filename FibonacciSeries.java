import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
	public static  void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> N = new ArrayList<Integer>();
		int FirstNum = sc.nextInt();
		N.add(FirstNum);
		int SecondNum = sc.nextInt();
		N.add(SecondNum);
		
		int range = sc.nextInt();
		int Sum=0;
		while(Sum<=100) {
			Sum = FirstNum+SecondNum;
			if(Sum<=100) {
				N.add(Sum);
			}
			
			
			FirstNum=SecondNum;
			SecondNum=Sum;
		}
		
		System.out.println(N);
	}

}
