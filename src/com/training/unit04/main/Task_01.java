package com.training.unit04.main;

import java.util.Random;

public class Task_01 {

	public static void main(String[] args) {
		int a = inputRan ();
		int b = inputRan ();
			
		outPrint ("a", a);
		outPrint ("b", b);
		
		int resuldGCD = greatestCommonDivisor(a,b);
		outPrint ("мнд", resuldGCD);
		
		int resulLCM = LeastCommonMultiple (resuldGCD, a , b);
		outPrint ("мнй", resulLCM);
		
	}

	private static int LeastCommonMultiple(int resuldGCD, int a, int b) {
		return a * b / resuldGCD;
	}

	private static int greatestCommonDivisor(int a, int b) {
		if (b > a) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int k;
		
		while (a - b != 0) {
			
			if (b > a) {
			a = a + b;
			b = a - b;
			a = a - b;
			}	
			k = a - b;
			a = b;
			b = k;
			
		}
		
		return a;
	}

	private static void outPrint(String sr, int a) {
		
		System.out.println(sr + " = " + a);

	}

	private static int inputRan() {
		
		Random ran = new Random ();
		return ran.nextInt(100);
		
	}

}
