package org.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		
// 		Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi,
//	 	e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		
		Random rand = new Random();
		
		String[] names = {
				"Luca",
				"Giovanni",
				"Alice",
				"Catia",
				"Salvatore",
				"Pietro",
				"Anna",
				
		};
		
		String[] lastNames = {
				"Rossi",
				"Follesa",
				"Caltagirone",
				"Creek",
				"Baruffaldi",
				"Casu",
				"Lorrai",	
		};
		
		String[] fakeList = new String[5];
		
  		
		for(int i= 0; i < 5; i++) {
	
			String fakeName = names[rand.nextInt(names.length)] + " " + lastNames[rand.nextInt(lastNames.length)];
			fakeList[i] = fakeName;
			
			System.out.println(fakeList[i]);
		}
	
		
	}
}
