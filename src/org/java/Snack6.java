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
		
		int intNum = 0;
		
		for(int i = 0; i < number.length(); i++) {
			
			intNum = (intNum * 10 ) + ((int)number.charAt(i) - 48);
			
		}
		
		System.out.println(intNum);
		
	}
}
