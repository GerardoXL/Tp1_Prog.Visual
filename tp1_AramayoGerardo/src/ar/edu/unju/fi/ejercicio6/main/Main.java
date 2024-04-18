package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
		
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		//crea una instacia persona mediante un constructor vacio
		
		Persona Persona = new Persona();
		
		//se ingresa los datos de la primera persona 
		
		System.out.println("Ingrese los datos de la primera persona");
		
		System.out.println("DNI: ");
		
		Persona.setDNI(scanner.nextInt());
		
		scanner.nextLine();

		System.out.println("Nombre: ");
		
		Persona.setNombre(scanner.nextLine());
		
		System.out.println("Fecha de nacimiento: ");
		
		Persona.setFecha_de_nacimiento(LocalDate.parse(scanner.nextLine(),formato));
		
		System.out.println("Provincia: ");
		
		Persona.setProvincia(scanner.nextLine());
		
        Persona.MostrarLosDatos();
        
        
        //se ingresa los datos de la segunda persona
        
        System.out.println("ingrese los datos de la segunda persona: ");
        
        System.out.println("DNI: ");
        
        int DNI = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Nombre: ");
        
        String nombre = scanner.nextLine();
        
        System.out.println("Fecha de nacimiento: ");
        
        LocalDate fecha_de_nacimiento = LocalDate.parse(scanner.nextLine(), formato);
        
        System.out.println("Provincia: ");
        
        String provincia = scanner.nextLine();
        
        Persona  Persona2 = new Persona(DNI,nombre,fecha_de_nacimiento,provincia);
        
        
        Persona2.MostrarLosDatos();
        
        //se ingresa los datos de la tercera persona
        
        System.out.println("ingrese los datos de la tercera persona: ");
        
        System.out.println("DNI: ");
        
        DNI = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Nombre: ");
        
        nombre = scanner.nextLine();
        
        System.out.println("Fecha de nacimiento: ");
        
        fecha_de_nacimiento = LocalDate.parse(scanner.nextLine(), formato);
        
        System.out.println("Provincia: ");
        
        provincia = scanner.nextLine();
        
        Persona Persona3 = new Persona(DNI, nombre, fecha_de_nacimiento);
        
        Persona3.MostrarLosDatos();
        
        
        scanner.close();
        
		}

}
