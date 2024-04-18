package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clase scanner para poder solicitar el ingreso de datos 
		
		Scanner entrada = new Scanner(System.in);
		
		//bucle for para solicitar el ingreso de las 3 diferentes pizzas
		
		for(int i = 0; i<=3; i++) {
			
			//constructor vacio
			
			Pizza  pizza = new Pizza();
			
			System.out.println("ingrese el diametro de la pizza: opciones: (20, 30, 40)");
			
	        pizza.setDiametro(entrada.nextDouble());
	        
	        System.out.println("la pizza tiene ingredientes especiales?:  opciones: (true/false)");
	        
	        pizza.setIngredientes_especiales(entrada.nextBoolean());
	        
	        
	        pizza.CalcularPrecio();
	        pizza.CalcularArea();
	        
	        System.out.println("el precio de la pizza es: " + pizza.getPrecio()+"$");
	        System.out.println("el area de la pizza es: " + pizza.getArea());
			
		}
		
		entrada.close();
		

	}

}
