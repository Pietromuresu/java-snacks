package org.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		
		
//		Chiedere all'utente numeri interi e calcolarene la somma. 
//		Continuare a chiedere numeri, finche' la sommatoria non supera il valore `1000`
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do{

		System.out.print("Digita un numero da sommare: ");
		int num = sc.nextInt();
		
		sum += num;
			
		}while(sum <= 1000);
		
		System.out.print("Somma finale: " + sum);
		
	}
}
