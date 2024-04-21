package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int numeros; 
		
		System.out.println("ingrese un numero del 5 al 10 ");
		numeros = entrada.nextInt();
		
		while(numeros <5 || numeros > 10) {
			
			System.out.println("No es un numero valido ");
			
			numeros = entrada.nextInt();
			
			}

		System.out.println("ingresaste el numero: " + numeros);
	

	       // se crea un array tipo String 
	
	    String[] nombres = new String[numeros];
	    
	    
	    for(int i = 0; i < numeros; i++) {
	    	
	    	System.out.println("ingrese el nombre de una persona: " );
	    	
	    	nombres[i] = entrada.next();
	    	
	    
	    }
	    
	    //muestra los nombres ingresados por el usuario
	    
	    System.out.println("los nombres ingresados son: ");
	    
	    for(int i = 0; i < numeros; i++) {
	    	
	    	System.out.println("Indice " + i + ": " + nombres[i]);
	    }
	    
	    //muetra en orden inverso 
	    
	    System.out.println("los nombres en orden inverso: ");
	    
	    for(int i = numeros - 1; i >=0; i--) {
	    	
	    	System.out.println("Indice " + i + ": " + nombres[i]);
	    	
	    	
	    }
	
	}
	
}
