package org.java;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
	
//		Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//
//		Possibile usare solo :
//
//		- cicli
//		- chartAt
//		- if / switch
//
//		Es. “25” come stringa deve essere convertito in intero 25.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number to convert in a string: ");
		String number = sc.next();
		
		
		int numberInt = (int)number.charAt(0) ;
	}
}
