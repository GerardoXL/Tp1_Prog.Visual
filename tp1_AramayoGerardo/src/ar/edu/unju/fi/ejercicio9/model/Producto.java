package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String nombre;
	private String codigo;
	private double precio;
	private double descuento;
	
	//constructor vacio o por defecto
	
	public Producto() {
		
		
		
	}
	
	//accesores getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	//metodo para calcular descuento
	
	public double CalculoDescuento() {
		
		return precio - (precio*descuento/100.0);
		
	}
	
	
	
	
	
	

}
