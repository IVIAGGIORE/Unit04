package com.training.unit04.main;

import java.util.Random;

public class Task_03 {

	public static void main(String[] args) {
		int a = inputRan ();
		int b = inputRan ();
		
		outPrint ("a = %d \n", a);
		outPrint ("b = %d \n", b);
		
		int quantityA = quantity (a);
		int quantityB = quantity (b);
		
		if (quantityA > quantityB) {
			outPrint ("В числе %d больше знаков", a);
		}
		if (quantityA < quantityB) {
			outPrint ("В числе %d больше знаков", b);
		}
		if (quantityA == quantityB) {
			outPrint ("В числах одинаковое количество знаков", quantityB);
		}
	}

	private static int quantity(int a) {
		
		int k = 0;
		
		while (a != 0) {
			k++;
			a = a / 10;	
		}
		
		return k;
	}

	private static void outPrint(String string, int b) {
		
		System.out.printf(string, b);
		
	}

	private static int inputRan() {
		
		Random ran = new Random ();
		
		return ran.nextInt(10000) - 4000;
	}

}
