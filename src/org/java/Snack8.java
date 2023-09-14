package org.java;

import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		

//		Creare un array di 10 interi randomici compresi tra 100 e 150. 
//		Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
//		Stampare inoltre il valore minimo, massimo e la media
		
		Random rand = new Random();
		
		int[] arrayNum = new int[10];
		
		int sum = 0;
		int avg = 0;
		
		
		for(int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = rand.nextInt(100, 150);
		}
		
		
		int max = arrayNum[0];
		int min = arrayNum[0];

		
		for(int i = 0; i < arrayNum.length; i++) {
		
			System.out.println(i + ". " + arrayNum[i]);
			if(arrayNum[i] > max) {
				max = arrayNum[i];
			}
			
			if(arrayNum[i] < min) {
				min = arrayNum[i];
			}
		}
		
		
		avg /= arrayNum.length;
		
		
		System.out.println("Average: " + avg);
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
	}
}
