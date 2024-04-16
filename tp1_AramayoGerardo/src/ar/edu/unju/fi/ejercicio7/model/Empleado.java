package ar.edu.unju.fi.ejercicio7.model;

public class Empleado { 
	
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO_SALARIO = 20000.00;
	
	
	private String nombre;
	private int legajo;
	private double salario;
	
	
	public Empleado(String nombre, int legajo, double salario) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if (salario>=SALARIO_MINIMO) {
			
			this.salario = salario;
			
		} else {
			
		    this.salario = SALARIO_MINIMO;	
			
			
		}
		
		
	}
	
	
	

}
