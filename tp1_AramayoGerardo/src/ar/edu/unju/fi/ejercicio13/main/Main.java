package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//se crea un objeto tipo scanner para el ingreso de datos
		
	  Scanner entrada = new Scanner(System.in);
		
		//se declara un array
		
		int[] numeros = new int [8];
		
		// se solicita que se introduzca los valores del array
		
		for(int i = 0; i < numeros.length; i++){
			
			System.out.println("ingrese el valor para el elemento " + (i+1) + ":");
			
			numeros[i] = entrada.nextInt();
			
			// "(i+1)" esto hace que el indice inicialice en 1 y no en 0 como es por defecto
		}
		
		     // muestra los indices y valores del array
			
			System.out.println("los valores que se ingresaron son: ");
			
			for(int i = 0; i < numeros.length; i++) {
				
				System.out.println("Indice: " + (i+1) + ", Valor: " + numeros[i]);
				
				// "(i+1)" esto hace que muestre al final el indice 1 y no 0 como es por defecto
			}
			
		}
		
		

	}


