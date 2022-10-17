package ejerciciosb1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		numero = sc.nextDouble();
		
		if(numero > -1 && numero < 1 && numero!=0) {
			System.out.println("Es casi-cero");
		} else
			System.out.println("No es casi-cero");
		
		sc.close();
	}
}
