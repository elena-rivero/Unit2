package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero = 0.25;
		
		if(numero > -1 && numero < 1 && numero!=0) {
			System.out.println("Es casi-cero");
		} else
			System.out.println("No es casi-cero");
		
		if(numero<=-1 || numero >=1 || numero ==0) {
			System.out.println("No es casi-cero");
		}
	}

}
