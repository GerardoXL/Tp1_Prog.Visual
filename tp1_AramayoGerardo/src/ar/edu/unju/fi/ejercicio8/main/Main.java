package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner  entrada = new Scanner(System.in);
		
		
		System.out.println("ingrese el valor de n: ");
		
		int n = entrada.nextInt();
		
		//se construyo un objeto de la clase CalculadoraEspecial
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		
		//se invoca los metodos del objeto y muestra el resultado por la consola
		
		double sumatoria = calculadora.CalcularSumatoria();
		System.out.println("el resultado de la sumatoria es: " + sumatoria);
		
		
		double productoria = calculadora.calcularProductoria();
		System.out.println("el resultado de la productoria es: " + productoria);
		
		

	}

}
