package org.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Snack3 {
	public static void main(String[] args) {
		//Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari
	
		Random rand = new Random();
		
		
		int maxLength = 10;
		int[] intList = new int[maxLength];
		int oddSum = 0;
		
		
		// Popolo l'array
		for(int i = 0; i < maxLength; i++) {
			intList[i] = rand.nextInt(1000);
			
		}
		
		
		
		System.out.println("The list: " + Arrays.toString(intList));
		
		// Sommo il numero ogni volta che la 'i' è dispari 
		for(int i = 0; i < intList.length; i++) {
			if(i % 2 != 0) {
				oddSum += intList[i];
			}
		}
		System.out.println("The sum: " + oddSum);
		
		
	}
}
