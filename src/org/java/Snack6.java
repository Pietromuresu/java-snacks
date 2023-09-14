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
		
		// Faccio un ciclo for sul numero inserito 
		for(int i = 0; i < number.length(); i++) {
			
			// Faccio il casting del carattere con indice equivalente alla 'i' in modo da avere un intero e controllo che posizione ha nella tabella ASCII
			// Sottraggo il 48 che sarebbe il codice corrispondente allo '0' nella tabella ASCII in modo da avere il numero sottoforma di intero
			// moltiplico per 10 in modo da avere il numero successivo all'indice corretto
			
			intNum = (intNum * 10 ) + ((int)number.charAt(i) - 48);
			
		}
		
		System.out.println(intNum);
		
	}
}
