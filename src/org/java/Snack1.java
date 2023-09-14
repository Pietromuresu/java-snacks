package org.java;

import java.util.Scanner;

public class Snack1 {

	
	public static void main(String[] args) {
		
		// Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digit a number: ");
		int selectedNumber = sc.nextInt();
		
		if(selectedNumber % 2 == 0) {
			System.out.println("Il numero '" + selectedNumber + "' è pari");
		}else {
			selectedNumber++; 
			System.out.println("Il numero '" + (selectedNumber - 1) + "' non è pari ma il successivo '" + selectedNumber + "' lo è");
		}
		
	}
}
