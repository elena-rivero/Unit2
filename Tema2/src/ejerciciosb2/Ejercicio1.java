package ejerciciosb2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una nota entera");
		nota = sc.nextInt();
		
		switch(nota) {
		case 0,1,2,3,4: System.out.println("Insuficiente");
		break;
		case 5: System.out.println("Suficiente");
		break;
		}
		
		sc.close();
	}

}
