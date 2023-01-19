package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla[] = new int[20];

		// variable en la que guardare la posicion a comprobar
		int posicion = 0;

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 101);
		}

		System.out.println(Arrays.toString(tabla));

		// bucle que se ejecutara mientras que posicion sea menor que longitud de array
		// tabla
		while (posicion < tabla.length) {

			// condicion que establece que no es par
			if (tabla[posicion] % 2 != 0) {
				// copio el array tabla desde la posicion siguiente a la posicion actual sobre
				// si mismo por una longitud
				// igual a la de la tabla menos la posicion -1
				// eliminando la posicion actual y dejando la ultima con valor por defecto 0
				System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
				// copio el array eliminando la ultima posicion con tabla.length-1
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			} else {
				// si posicion no contiene un elemento impar paso a la siguiente posicion del
				// array
				posicion++;
			}

		}

		System.out.println(Arrays.toString(tabla));

	}

}
