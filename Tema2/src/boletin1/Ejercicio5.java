package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// num1, num2, num3 son las variables donde guardaremos los valores introducidos
		// por el usuario
		int num1, num2, num3;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario cada número
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		System.out.println("Introduzca el tercer número:");
		num3 = sc.nextInt();

		if (num1 > num2 && num2 > num3) { // num1 > num2 > num3
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else if (num1 > num3 && num3 > num2) { // num1 > num3 > num2
			System.out.println(num1 + ", " + num3 + ", " + num2);
		} else if (num2 > num1 && num1 > num3) { // num2 > num1 > num3
			System.out.println(num2 + ", " + num1 + ", " + num3);
		} else if (num2 > num3 && num3 > num1) { // num2 > num3 > num1
			System.out.println(num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num1 && num1 > num2) { // num3 > num1 > num2
			System.out.println(num3 + ", " + num1 + ", " + num2);
		} else { // num3 > num2 > num1
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
	}

}
