package com.ssbaez.ejercicio627;

import java.util.Scanner;

public class MCD {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicacion que calcula y muestra el MCD de dos numeros");
		System.out.printf("%s%n%s",
						  "Ingrese el primer numero",
						  "----> ");
		int a = input.nextInt();
		System.out.printf("%s%n%s",
				  		  "Ingrese el segundo numero",
				  		  "----> ");
		int b = input.nextInt();
		
		System.out.println("El M.C.D. es: " + mcd(a, b));
		
	}
	
	public static int mcd(int num1, int num2) {
		
		int maxCD = 0;
		int a = num1;
		int b = num2;
		int resto;
		
		resto = a % b;
		
		while(resto != 0) {
			
			a = resto;
			resto = b % a;
			b = a;
			
		}
		
		maxCD = a;
		
		return maxCD;
		
	}

}
