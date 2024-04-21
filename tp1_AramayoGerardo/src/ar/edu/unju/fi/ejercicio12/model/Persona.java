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
           //metodo para determinar el signo del zodiaco de la persona
	   
	     public String SignoZodiacoPersona(){
	    	 
	    	int mes = fecha_de_nacimiento.get(Calendar.MONTH) +1;
	    	
	    	int dia = fecha_de_nacimiento.get(Calendar.DAY_OF_MONTH);
	    	
	    	if((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	    		
	    		return "Acuario";
	    		
	    	}else if((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)){
	    		
	    		return "Piscis";
	    		
	    	}else if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)){
	    		
	    		return "Aries";
	    		
	    	}else if((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)){
	    		
	    		return "Tauro";
	    		
	    	}else if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)){
	    		
	    		return "Geminis";
	    		
	    	}else if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)){
	    		
	    		return "Cancer";
	    		
	    	}else if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)){
	    		
	    		return "Leo";
	    		
	    	}else if((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)){
	    		
	    		return "Virgo";
	    		
	    	}else if((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)){
	    		
	    		return "Libra";
	    		
	    	}else if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){
	    		
	    		return "Escorpio";
	    		
	    	}else if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){
	    		
	    		return "Sagitario";
	    		
	    	}else {
	    		
	    		return "Capricornio";
	    		
	    	}
	     }
	    	
	    	public String EstacionAnio() {
	    		
	    		int mes = fecha_de_nacimiento.get(Calendar.MONTH) + 1;
	    		int dia = fecha_de_nacimiento.get(Calendar.DAY_OF_MONTH);
	    		
	    		if((mes == 12 && dia >=21) || (mes == 1 )|| (mes == 2 && dia >=20 )) {
	    		
	    			return "Verano";
	    			
	    		}else if((mes == 3 && dia >=21) || (mes == 4 )|| (mes == 5 && dia >=20 )) {
	    			
	    			return "Otoño";
	    			
	    		}else if((mes == 6 && dia >=21) || (mes == 7 )|| (mes == 8 && dia >=20 )) {
	    			
	    			return "Invierno";
	    			
	    		}else {
	    			
	    			return "Primavera";
	    		}
	    		
	    		
	    	
			
	    	 
			
	
	}
    
}
