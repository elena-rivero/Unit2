package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// num1, num2, num3 son las variables donde se guardarán los tres números
		// introducidos por el usuario
		int num1, num2, num3;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca los tres números por teclado
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		System.out.println("Introduzca el tercer número:");
		num3 = sc.nextInt();

		if ((num1 + num2) == num3) {
			// num1 + num2 = num3
			System.out.println("La suma de " + num1 + " + " + num2 + " es " + num3);
		} else if ((num1 + num3) == num2) {
			// num1 + num3 = num2
			System.out.println("La suma de " + num1 + " + " + num3 + " es " + num2);
		} else if ((num2 + num3) == num1) {
			// num2 + num3 = num1
			System.out.println("La suma de " + num2 + " + " + num3 + " es " + num1);
		} else {
			// No se cumple que un número es igual a la suma de los otros dos números
			System.out.println("Ningún número es la suma de los otros dos");
		}
	}
}
