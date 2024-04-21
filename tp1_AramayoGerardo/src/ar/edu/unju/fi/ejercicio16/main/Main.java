package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String[] nombres = new String[5];
		
		
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.println("ingrese el nombre de una persona: " + (i+1) + ":");
			
			nombres[i] = entrada.nextLine();
			
		}

	}

}
