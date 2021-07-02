package com.training.unit04.main;

import java.util.Arrays;
import java.util.Random;

public class Task_04 {

	public static void main(String[] args) {
		int n = inputRan (10) + 4;
		
		int[] mas = new int[n];
				
		//заполнение массива рандомными числами 
		mas = inputRanMas(1000, mas);
		
		//вывод массива
		outputArray (mas);
		
		
		int k = inputRan (n - 3);
		outPrint ("сумма от %d  ", k);
		
		int m = k + 3;
		outPrint ("до  %d  ", m);
		
		int sum = sumThreeArray (k, m, mas); 
		outPrint (" равна %d \n", sum);
		

	}

	private static void outputArray(int[] mas) {
		System.out.printf("n \t");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%d \t", i);
		}
		System.out.printf("\n");
		
		System.out.printf("mas[i] \t");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%d \t", mas[i]);
		}
		System.out.printf("\n");		
	}

	private static int sumThreeArray(int k, int m, int[] mas) {
		int sum = 0; 
		for (int i = k; i <= m; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	private static int[] inputRanMas(int k, int[] mas) {
		Random ran = new Random ();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = ran.nextInt(k);
		}
		return mas;
	}

	private static int inputRan(int k) {
		
		Random ran = new Random ();
		
		return ran.nextInt(k);
	}
	private static void outPrint(String string, int b) {
		
		System.out.printf(string, b);
		
	}

}
