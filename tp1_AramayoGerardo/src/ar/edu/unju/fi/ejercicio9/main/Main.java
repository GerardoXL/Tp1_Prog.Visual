package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objeto de la clase scanner para leer la entrada del usuario
		
		Scanner  entrada = new Scanner (System.in);
		
		//se crea un array para almacenar los productos
		
		Producto[] productos = new Producto[3];
		
		
		for(int i=0; i<productos.length; i++){
		
		System.out.println("ingrese los datos del producto: " + (i + 1)+" : ");
		
		
		productos[i] = new Producto();
		
		System.out.println("Nombre: ");
		productos[i].setNombre(entrada.nextLine());
		
		
		System.out.println("Codigo: ");
		
		productos[i].setCodigo(entrada.nextLine());
		
		System.out.println("Precio: ");
		
		productos[i].setPrecio(Double.parseDouble(entrada.nextLine()));
		
		System.out.println("Descuento: ");
		
		productos[i].setDescuento(Integer.parseInt(entrada.nextLine()));
		
		
		}
		
		//se muestra los datos ingresados de cada producto y el resultado del descuento
		
		for(int i = 0; i < productos.length; i++){
			
			System.out.println("Datos del producto: " + (i+1) + ":");
			
			System.out.println("Nombre: " + productos[i].getNombre());
			System.out.println("Codigo: " + productos[i].getCodigo());
			System.out.println("Precio: " + productos[i].getPrecio()+"$");
			System.out.println("Descuento: " + productos[i].CalculoDescuento()+"$");
			
			
			
		}
		
	}
}
