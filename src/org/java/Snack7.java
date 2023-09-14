package org.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		
//		Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi 
//		mostrare a video la stringa generata (secondi → “hh:mm:ss”)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type seconds to convert here: ");
		int seconds = sc.nextInt();
		
		double hours = 0d;
		
		double minutesCalculated = 0d;
		double secondsCalculated = 0d;
		
		if(seconds > 60) {
			double grossMinutes = seconds / 60d;
			System.out.println(grossMinutes);
			hours = grossMinutes / 60;
			System.out.println(hours);
			minutesCalculated = (hours - Math.floor(hours)) * 60;
			System.out.println(minutesCalculated);

			secondsCalculated = (minutesCalculated - Math.floor(minutesCalculated)) * 60;
			System.out.println(secondsCalculated);
			 
		}
		
		System.out.println("Secondi: " + seconds + "-> Orario convertito: " + String.format("%.00f", Math.floor(hours)) +":" +  String.format("%.00f", Math.floor(minutesCalculated)) + ":" + String.format("%.00f", Math.floor(secondsCalculated)));
				
				
		
	}
}
