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
		
		
		// Popolo l'array
		for(int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = rand.nextInt(100, 150);
		}
		
		
		// Imposto le variabili per il valore massimo e quello minimo come il primo elemento dell'array 
		int max = arrayNum[0];
		int min = arrayNum[0];

		
		for(int i = 0; i < arrayNum.length; i++) {
		
			System.out.println(i + ". " + arrayNum[i]);
			
			// Sommo i valori per calolare la media
			sum += arrayNum[i];
			
			// Se il valore è maggiore del valore corrente il max assume il valore del maggiore 
			if(arrayNum[i] > max) {
				max = arrayNum[i];
			}

			// Se il valore è minore del valore corrente il min assume il valore del minore
			if(arrayNum[i] < min) {
				min = arrayNum[i];
			}
		}
		
		// Calcolo la media
		avg = sum / arrayNum.length;
		
		
		System.out.println("Average: " + avg);
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
	}
}
