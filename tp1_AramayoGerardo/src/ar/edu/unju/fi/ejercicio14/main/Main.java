package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		
		System.out.println("Ingrese un numero del 3 al 10: ");
		numeros = entrada.nextInt();
		
		
		
		while(numeros < 3 || numeros >10) {
			
			System.out.println("No es un numero valido: ");
			
			numeros = entrada.nextInt();
		}
		
		System.out.println("ingresaste el numero: " + numeros);
		

	}

}
