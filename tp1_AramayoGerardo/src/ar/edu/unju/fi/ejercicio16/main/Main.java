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
		
		//bucle while para mostrar los nombres 
		
		int indice = 0;

		System.out.println("los que nombres que ingresó son: ");
		
		while(indice < nombres.length) {
			
			System.out.println(nombres[indice]);
			
			indice++;
		}
		
		//se muestra el tamaño del array
		
		System.out.println("el tamaño del array es: " + nombres.length);
		
		
		
		
		
	}

}
