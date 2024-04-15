package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
	    int num;
	    
	    System.out.println("ingrese un numero entero");
	    
	    num = entrada.nextInt();
		
		if(num%2 == 0) {
			
			System.out.println("el numero ingresado es par y su triple es " + 3*num);
			
		}
		else{
			
			System.out.println("el numero ingresado es impar y su doble es " +2*num);
		

	}
		
		
		entrada.close();
		
}
	
	
	
}