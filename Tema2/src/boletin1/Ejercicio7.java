package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// num es el número que el usuario introducirá por teclado
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número por teclado
		System.out.println("Introduzca un número comprendido entre 0 y 99999");
		num = sc.nextInt();
		
		// Comprobamos que el número está dentro del rango solicitado
		if (num < 0 || num > 99999) {
			System.out.println("ERROR: El número debe estar comprendido entre 0 y 99999");
		} else {
			// Si el número se encuentra dentro del rango, hacemos las distintas comprobaciones
			if (num <= 9) {
				// Si es <=9 tiene 1 cifra
				System.out.println("El número tiene 1 cifra");
			} else if (num <= 99) {
				// Si es <=99 tiene 2 cifras
				System.out.println("El número tiene 2 cifras");
			} else if (num <= 999) {
				// Si es <=999 tiene 3 cifras
				System.out.println("El número tiene 3 cifras");
			} else if (num <= 9999) {
				// Si es <=9999 tiene 4 cifras
				System.out.println("El número tiene 4 cifras");
			} else if (num <= 99999) {
				// Si es <=99999 tiene 5 cifras
				System.out.println("El número tiene 5 cifras");
			}
		}
		
	}

}
