package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private int DNI;
	private String nombre;
	private LocalDate fecha_de_nacimiento;
	private String provincia;
	
	
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}
	public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
    public int calculoEdad() {
    	
    	return Period.between(fecha_de_nacimiento, LocalDate.now()).getYears();
    	
    }
    
    
    public boolean MayorDeEdad() {
    		
    	return calculoEdad() > 18;
    		
    		
    	}
    
    public void MostrarLosDatos() {
    	
    	System.out.println("DNI: " + DNI);
    	System.out.println("Nombre" + nombre);
    	System.out.println("Fecha de Nacimiento" + fecha_de_nacimiento);
    	System.out.println("Provincia" + provincia);
    	System.out.println("Edad" + calculoEdad());
    	
    	
    	
    	
    }
    
    	
    }	

	


