package sample_0317;

import java.util.*;

public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5, y=6, result;
		result = x*y;
		System.out.println(result);
	
		x=2;
		y=2;
		result = x<<2;
		System.out.println(result);
		
		Scanner input = new Scanner(System.in);
		System.out.println("a 입력하시오");
		int a = input.nextInt();
		System.out.println("b 입력하시오");
		int b = input.nextInt();
		
		result = a+b;
		System.out.println(result);
		
		input.close();
		
	}

}
