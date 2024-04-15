package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crea una instacia persona mediante un constructor vacio
		
		Persona Persona = new Persona();
		
		// se establece valores de los atributos
		
		Persona.setDNI(41653761);
		Persona.setNombre(" Mario ");
		Persona.setFecha_de_nacimiento(LocalDate.of(1999, 01, 21));
		Persona.setProvincia(" Jujuy ");
		
		Persona.MostrarLosDatos();
		
		
		
		

	}

}
