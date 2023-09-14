package org.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		// Data in input una stringa verificare se è palindroma
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write a string here: ");
		String word = sc.next();
		
		char[] arrWordReverse = new char[word.length()];
		
		// Salvo i caratteri della parola inserita al contrario in un array
		for(int i = 0; i < word.length(); i++) {
			
			arrWordReverse[i] = word.charAt((word.length() -1) - i);	
		}
		
		String reversedWord = new String(arrWordReverse);

		// Controllo che la paorala iniziale e quella al contrario siano uguali e stampo il risultato
		if(!word.equals(reversedWord)) {
			
			System.out.println("The word '" + word + "' isn't palindrome ");
			return;
		
		}else {
			
			System.out.println("The word '" + word + "' is palindrome!!!");
		}
		
	}
}
