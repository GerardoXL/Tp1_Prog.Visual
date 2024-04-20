package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner entrada = new Scanner(System.in);

			
		System.out.println("ingrese su nombre: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("ingrese su fecha de nacimiento: ");
		
		String fecha_de_nacimiento = entrada.nextLine();
		
		SimpleDateFormat fechaformato = new SimpleDateFormat("dd-MM-yyyy");
		
        Date fechaNacimientoDate = null;
        
        try {
        	
        	fechaNacimientoDate = fechaformato.parse(fecha_de_nacimiento);
        	
        } catch (Exception e) {
        	
        	System.out.println("formato de fecha incorrecto");
        	System.exit(0);
        }
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(fechaNacimientoDate);
        
        
        Persona persona = new Persona (nombre, fechaNacimiento);
        
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.CalculoAñosPersona());
        
	}

	
	
	
}