package ar.edu.unju.fi.ejercicio7.model;

public class Empleado { 
	
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO_SALARIO = 20000.00;
	
	
	private String nombre;
	private int legajo;
	private double salario;
	
	//constructor parametrizado
	public Empleado(String nombre, int legajo, double salario) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario < SALARIO_MINIMO ? SALARIO_MINIMO : salario;
		
		if (salario>=SALARIO_MINIMO) {
			
			this.salario = salario;
			
		} else {
			
		    this.salario = SALARIO_MINIMO;	
			
			
		}
		
	}
	
	
public void mostrarlosDatos() {
		
		
		System.out.println("Nombre del empleado: " + nombre);
		
		System.out.println("Legajo: " + legajo);
		
		System.out.println("Salario: " + salario+"$");
		
	}

		
		
		//metodo para el aumento del salario 
	
	   public void DarAumento() {
		   
		   salario += AUMENTO_SALARIO;
	   }
	   
	   //getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	   
	   

}
