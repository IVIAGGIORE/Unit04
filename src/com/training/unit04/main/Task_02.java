package com.training.unit04.main;

import java.util.Random;

public class Task_02 {

	public static void main(String[] args) {
		int a = inputRan ();
		int b = inputRan ();
		int c = inputRan ();
		
		outPrint ("a = ", a);
		outPrint ("b = ", b);
		outPrint ("c = ", c);
		
		int maxABC = max (a, b, c);
		int minABC = min (a, b, c);
		
		int sum = sumMaxMin (maxABC, minABC);
		outPrint ("сумма максимальнного и минимального равна ", sum);
		
	}

	private static int sumMaxMin(int maxABC, int minABC) {
		return maxABC + minABC;
	}

	private static int min(int a, int b, int c) {
			
		if (a <= b && a <= c) {
	 			return a;
	 		}
	 	if (b <= a && b <= c) {
	 			return b;
	 		}
	 	if (c <= a && c <= b) {
	 			return c;
	 		}
		return 0;
	}

 	private static int max(int a, int b, int c) {
	 		
 		if (a >= b && a >= c) {
	 			return a;
	 		}
	 	if (b >= a && b >= c) {
	 			return b;
	 		}
	 	if (c >= a && c >= b) {
	 			return c;
	 		}
	 	return 0;
	}

	private static void outPrint(String string, int a) {
			
		System.out.println(string + a);
					
	}

	private static int inputRan() {
		
		Random ran = new Random();
		
		return ran.nextInt(1000) - 400;
	}

}
