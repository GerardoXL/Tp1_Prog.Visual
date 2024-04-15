package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int num;
		int factorial=1;
		
	    System.out.println("ingrese un numero");
	    num=entrada.nextInt();
	    
	    if(num<=10) {
	    
	    while(num>1) { 
	    	                           //5*4*3*2*1 = 120/
	    	factorial =factorial*num;
	    	num = num-1;
	    	
	    	System.out.println(factorial + " X " + num + " = " + factorial*num);
	    	
	    	
	    	
	    }

	} else { System.out.println("el numero ingresado excede a 10");
		
	}
	    
	    entrada.close();

}
	
	
}