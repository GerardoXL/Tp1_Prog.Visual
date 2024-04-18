package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private double diametro;
	private double precio;
	private double area;
	private boolean ingredientes_especiales;
	private final double ADICIONAL_INGREDIENTES_20=500;
	private final double ADICIONAL_INGREDIENTES_30=750;
	private final double ADICIONAL_INGREDIENTES_40=1000;
	
	//accesores getters and setters
	
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientes_especiales() {
		return ingredientes_especiales;
	}
	public void setIngredientes_especiales(boolean ingredientes_especiales) {
		this.ingredientes_especiales = ingredientes_especiales;
	}
	
	
    //metodo para calcular el precio de la pizza
	
	public void CalcularPrecio() {
		
		if(diametro == 20) {
			
			precio = ingredientes_especiales ? 4500 + ADICIONAL_INGREDIENTES_20 : 4500;
			
		} else if(diametro == 30){  
			
			precio = ingredientes_especiales ? 4800 + ADICIONAL_INGREDIENTES_30 : 4800;
			
			
		       }
		
		else if(diametro == 40 ) {
			
			precio = ingredientes_especiales ? 5500 + ADICIONAL_INGREDIENTES_40 : 5500;
			
			
		     }
			
			
			
		}
		
	   //metodo para calcular el area
	
	
	  public void CalcularArea() {
		  
		  double r = diametro/2;
		  
		  area = Math.PI*Math.pow(r, 2);
		  
		  
	  }
	
	
	} 
	
	
	
	
	
	
	


