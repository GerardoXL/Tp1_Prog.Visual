package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;
	
   //constructor vacio
	
	public CalculadoraEspecial() {
		
		this.n = 0;	
		
		}
	
   //accesores

	public int getN() {
		return this.n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	//metodos para calcular la sumatoria
	
	public double CalcularSumatoria() {
		
		double sumatoria = 0;
		
		for(int k = 1; k <= n; k++) {
			
			sumatoria += Math.pow(k*(k+1)/2, 2);
			
			
		}
		return sumatoria;
		
	}
	
	//metodos para calcular la sumatoria
	
	public double calcularProductoria() {
		
		double productoria = 1;
		
		for(int k = 1; k <=n; k++) {
			
			productoria = k*(k+4);
		}
		
		return productoria;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
