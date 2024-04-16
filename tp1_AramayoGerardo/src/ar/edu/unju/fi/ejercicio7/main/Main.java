package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("ingrese el nombre del empleado: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("ingrese el legajo del empleado: ");
		
		int legajo = entrada.nextInt();
		
		System.out.println("ingrese el salario del empleado: ");
		
		double salario = entrada.nextDouble();
		
		//se crea el objeto empleado
		Empleado empleado = new Empleado (nombre, legajo, salario);
		
		//se muestra el salario 
		
		empleado.mostrarlosDatos();
		
		//dar el aumento al salario
		
		empleado.DarAumento();
		
		//se muestra los datos del empleado luego del aumento 
		
		empleado.mostrarlosDatos();
		
		
		
		

	}

}
