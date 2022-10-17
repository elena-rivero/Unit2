package ejerciciosb1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;
		int jugador1, jugador2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Jugador 1: Elija PIEDRA [1], PAPEL [2] o TIJERAS [3]");
		jugador1 = sc.nextInt();

		System.out.println("Jugador 2: Elija PIEDRA, PAPEL o TIJERAS");
		jugador2 = sc.nextInt();

		// Comprobamos que los valores introducidos son correctos
		if (jugador1 < 1 || jugador1 > 3) {
			System.out.println("Jugador 1: No ha introducido un valor válido");
		} else if (jugador2 < 1 || jugador2 > 3) {
			System.out.println("Jugador 2: No ha introducido un valor válido");

			// Si los valores introducidos son correctos, hacemos las distintas
			// comprobaciones
		} else {
			if (jugador1 == jugador2) {
				System.out.println("EMPATE");
			} else if (jugador1 == PIEDRA && jugador2 == TIJERAS 
					|| jugador1 == TIJERAS && jugador2 == PAPEL
					|| jugador1 == PAPEL && jugador2 == PIEDRA) {
				System.out.println("Gana el jugador 1");
			} else {
				System.out.println("Gana el jugador 2");
			}
		}

		sc.close();
	}
}
