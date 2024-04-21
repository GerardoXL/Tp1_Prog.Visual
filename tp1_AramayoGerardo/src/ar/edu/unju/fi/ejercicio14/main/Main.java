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
		
		
		
		//se crea un array de enteros de un tamaño ingresado por el usuario
		
		int[] array = new int[numeros];
		
		//acumulador para la suma de los numeros ingresados 
		
		int SumaDeArray = 0;
		
		//se llena el array con los numeros ingresados por el usuario
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Ingrese un numero para la posicion " + (i+1) + " del array: ");
			
			array[i] = entrada.nextInt();
			
			SumaDeArray += array[i];
			
		}
		
		//se muestran los valores de cada posicion 
		
		System.out.println("Los valores de cada posicion son: ");
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] + " ");
			
			
			
			}
		  
		// se muestra la suma los numeros ingresados por el usuario 
		
		System.out.println("La suma de los numeros que ingreso es: " + SumaDeArray);

	}

}
