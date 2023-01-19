package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	
	static boolean esPrimo(int n) {

		boolean esPrimo = true;

		if ((n == 1) || (n == 0)) {
			esPrimo = false;

		} else {

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		return esPrimo;
	}
	
	public static void main(String[] args) {
		
		int tabla[] = new int[10];
		
		int posicion=0;

		Scanner dogma = new Scanner(System.in);

		// for para rellenar array con numeros por teclado
		for (int i = 0; i <= tabla.length - 1; i++) {
			System.out.println("Introduzca un numero: ");
			tabla[i] = dogma.nextInt();
		}
		
		dogma.close();
		
		while (posicion<tabla.length) {
			
			//si es par 
			if (!esPrimo(tabla[posicion])) {
			//copio el array tabla desde la posicion siguiente a posicion actual sobre si mismo por una longitud 
			//igual a la de la tabla menos la posicion -1 eliminando la posicion actual y dejando la ultima con valor por defecto
				System.arraycopy(tabla, posicion+1, tabla, posicion, tabla.length-posicion-1);
				//copio el array eliminando la ultima posicion con tabla.length-1
				tabla=Arrays.copyOf(tabla,tabla.length-1);
			} else {
				//si posicion no contiene un elemento impar paso a la siguiente posicion del array
				posicion++;
			}
		 
		}
		
		System.out.println(Arrays.toString(tabla));

	}

}
