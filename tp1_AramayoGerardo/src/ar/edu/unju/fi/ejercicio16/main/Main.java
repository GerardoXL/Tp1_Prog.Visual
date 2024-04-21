package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String[] nombres = new String[5];
		
		
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.println("ingrese el nombre de una persona: " + (i) + ":");
			
			nombres[i] = entrada.nextLine();
			
		}
		
		//bucle while para mostrar los nombres 
		
		int indice = 0;

		System.out.println("los que nombres que ingresó son: ");
		
		while(indice < nombres.length) {
			
			System.out.println("indice " + indice + " Nombre: " + nombres[indice]);
			
			indice++;
		}
		
		//se muestra el tamaño del array
		
		System.out.println("el tamaño del array es: " + nombres.length);
		
		
		//para eliminar un elemento del array
		
		
		byte EliminarIndice;
		
		do {
			
			System.out.println("ingrese el indice que desea eliminar: ");
			
			EliminarIndice = entrada.nextByte();
			
		} while (EliminarIndice < 0 || EliminarIndice >= nombres.length);
		
		
		// para realizar un desplazamiento de elementos
		
		 for(int i = EliminarIndice; i < nombres.length - 1; i++) {
			 
			 nombres[i] = nombres[i+1];
		 }
		 
		 
		 //para asignar un espacio en blanco al ultimo elemento
		 
		 nombres[nombres.length - 1] = "";
		 
		 
		 //para mostrar los nombres despues de eliminar el indice
		 
		 System.out.println("los nombres despues de eliminar el indice son: ");
		 
		 indice = 0;
		 
		 while(indice < nombres.length) {
			 
			 System.out.println(nombres[indice]);
			 indice++;
		 }
		
		
		
	}

}
