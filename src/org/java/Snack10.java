package org.java;

import java.util.Random;

public class Snack10 {
	public static void main(String[] args) {
//		Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
//			- tutti gli elementi pari
//			- tutti gli elementi dispari
//			- tutti gli elementi in indice pari
//			- tutti gli elementi in indice dispari
	
		Random rand = new Random();
		int[] arrayNums = new int[10];
		
		
		// Popolo l'array
		for(int i = 0; i < arrayNums.length; i++) {
			arrayNums[i] = rand.nextInt(100, 1000);	
		}
		
		// Stampo i numeri pari
		System.out.println("\n Numeri pari: ");
		for(int i = 0; i < arrayNums.length; i++) {
			
			if(arrayNums[i] % 2 == 0) {
				
				System.out.println("-" + arrayNums[i]);	
			}
		}
		
		// Stampo i numeri dispari
		System.out.println("\n Numeri dispari: ");
		for(int i = 0; i < arrayNums.length; i++) {
			if(arrayNums[i] % 2 != 0) {
				
				System.out.println("-" + arrayNums[i]);	
			}	
		}

		// Stampo i numeri  con indice pari
		System.out.println("\n Numeri con indice pari: ");
		for(int i = 0; i < arrayNums.length; i++) {
			if(i % 2 == 0) {
				
				System.out.println("-" + arrayNums[i]);	
			}
		}

		// Stampo i numeri  con indice dispari
		System.out.println("\nNumeri con indice dispari: ");
		for(int i = 0; i < arrayNums.length; i++) {
			if(i % 2 != 0) {
			
				System.out.println("-" + arrayNums[i]);	
			}	
		}

		
	
	}
}
