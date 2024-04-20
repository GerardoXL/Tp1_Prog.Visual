package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fecha_de_nacimiento;
	
	
	public Persona (String nombre, Calendar fecha_de_nacimiento) {
		
		this.nombre = nombre;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public Calendar getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}






	public void setFecha_de_nacimiento(Calendar fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}




	//metodos para determinar cuantos años tiene la persona
	
    public int CalculoAñosPersona(){
		
		Calendar fechaActual = Calendar.getInstance();
		
		int edad = fechaActual.get(Calendar.YEAR) - fecha_de_nacimiento.get(Calendar.YEAR);
		
		if(fechaActual.get(Calendar.DAY_OF_MONTH) > fecha_de_nacimiento.get(Calendar.DAY_OF_MONTH)
				|| fecha_de_nacimiento.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)
				&& fecha_de_nacimiento.get(Calendar.DATE) > fechaActual.get(Calendar.DATE)) {
		
		edad --;
		
		}
	   return edad;
	
	}
    
}
