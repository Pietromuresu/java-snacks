package org.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		
//		Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi 
//		mostrare a video la stringa generata (secondi → “hh:mm:ss”)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type seconds to convert here: ");
		int seconds = sc.nextInt();
		
		
		// inizializzo le variabili che mi servono
		double hours = 0d;
		
		double minutesCalculated = 0d;
		double secondsCalculated = 0d;
		
		
		// Se i secondi sono maggiori di 60(1 minuto) Calcolo i minuti e poi le ore
		if(seconds > 60) {
			// Totale dei minuti
			double grossMinutes = seconds / 60d;

			// Totale delle ore ricavate dai minuti
			hours = grossMinutes / 60;
			
			// sottraggo l'intero in modo da avere solo i decimali e li moltiplico per 60 in modo da avere i minuti reali
			minutesCalculated = (hours - Math.floor(hours)) * 60;
			
			// Sottraggo di nuovo l'intero in modo da avere solo i decimali e li moltiplico per 60 in modo da avere i secondi reali 
			secondsCalculated = (minutesCalculated - Math.floor(minutesCalculated)) * 60;
			 
		}
		
		// Mostro il risultato a schermo
		System.out.println("Secondi: " + seconds + "-> Orario convertito: " + String.format("%.00f", Math.floor(hours)) +":" +  String.format("%.00f", Math.floor(minutesCalculated)) + ":" + String.format("%.00f", Math.floor(secondsCalculated)));
				
				
		
	}
}
