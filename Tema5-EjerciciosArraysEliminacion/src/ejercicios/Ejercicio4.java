package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tabla[] = new int[20];

		int numeroIntroducido;//variable en la que guardare el numero introducido por el usuario

		int posicion = 0;//variable en la que guardare la posicion del array tabla

		Scanner dogma = new Scanner(System.in);

		// bucle for para recorrer el array tabla
		for (int i = 0; i < tabla.length; i++) {
			// doy a posicion i de array tabla valores aleatorios del 0 al 10
			tabla[i] = (int) (Math.random() * 11);
		}

		// muestro el array tabla en pantalla con print
		System.out.println(Arrays.toString(tabla));

		// solicito numero al usuario
		System.out.println("Introduzca un numero entero: ");
		numeroIntroducido = dogma.nextInt();

		dogma.close();

		// bucle while que recorrera el array tabla
		while (posicion < tabla.length) {

			// si el valor del elemento de la posicion actual del array tabla es mayor que
			// el valor de numeroIntroducido lo borro del array
			if (tabla[posicion] > numeroIntroducido) {

				// copiando el array tabla desde la posicion siguiente a la posicion actual
				// sobre
				// si mismo por una longitud igual a la de la tabla menos la posicion -1
				// eliminando la posicion actual y dejando la ultima con valor por defecto 0
				System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
				// copio el array eliminando la ultima posicion con tabla.length-1
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			} else {

				// si posicion contiene un elemento menor a numeroIntroducido paso a la
				// siguiente posicion del array
				posicion++;
			}
		}

		System.out.println(Arrays.toString(tabla));

	}

}
