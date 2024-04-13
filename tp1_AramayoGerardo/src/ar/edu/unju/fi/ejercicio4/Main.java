package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int num;
		
	    System.out.println("ingrese un numero");
	    num=entrada.nextInt();
	    int factorial=1;
	    
	    while(num>0) {  
	    	                           //5*4*3*2*1 = 120
	    	factorial =factorial*num;
	    	num = num-1;
	    	
	    	System.out.println("el factorial es " + factorial);
	    	
	    }

	}

}
