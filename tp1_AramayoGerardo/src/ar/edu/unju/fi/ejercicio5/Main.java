package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		///TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("ingrese un numero");  
		num=entrada.nextInt();
		
		if(num<10) {
		
		for(int i=0; i<=10; i++){
			
			int temp = i*num;
			
		System.out.println(num + " X " + i + " = " + temp);
		
		}
		
		} else {System.out.println("el numero ingresado excede a 9");}

	}

}
