package org.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
// 		Data una stringa in input mostrare a video 

//		1. quanti caratteri alfabetici contiene, 
		
//		2. quanti numeri

//		3. quanti simboli non alfanumerici.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a string here: ");
		String word = sc.next();
		
		int countNumbers = 0;
		int countLetters = 0;
		int countNonAlphanum = 0;
		
		for(int i = 0; i < word.length(); i++) {
			
			if(Character.isDigit(word.charAt(i))) {
				countNumbers++;
			}else if(Character.isLetter(word.charAt(i))){
				countLetters++;
			}else {
				countNonAlphanum++;
			}
		}
		
		
		System.out.println("Numbers: " + countNumbers);
		System.out.println("Letters: " + countLetters);
		System.out.println("Specials: " + countNonAlphanum);
		
	}
}
