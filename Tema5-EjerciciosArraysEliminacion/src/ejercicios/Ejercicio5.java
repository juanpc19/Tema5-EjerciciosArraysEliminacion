package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tabla[] = new int[0];// creo array tabla con 0 posiciones para asignar las necesarias posteriormente

		int numeroIntroducido;// variable donde guardare el numero introducido por el usuario

		int posicion;// variable que guardara la posicion en la que se ha encontrado el numero
		// introducido si este se ha encontrado

		int posicionAleatoria1; // variable en la que guardare la posicion1 aleatoria a eliminar

		int posicionAleatoria2; // variable en la que guardare la posicion2 aleatoria a eliminar

		int numeroA; // variable en la que guardare el valor de la posicion1 del array tabla

		int numeroB; // variable en la que guardare el valor de la posicion2 del array tabla

		int mediaAritmetica; // variable en la que guardare el valor de la media aritmetica
		// de numeroA y numeroB

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca sus 10 numeros favoritos: ");

		// bucle que se ejecutara mientras el array tabla tenga longitud inferior a 10
		//para ir dando valores introducidos por el usuario al array tabla
		while (tabla.length < 10) {

			// ordeno el array tabla al inicio de iteracion para busqueda binaria posterior
			Arrays.sort(tabla);

			// print del array tras ordenar para ver como se van introduciendo los datos
			System.out.println(Arrays.toString(tabla));

			System.out.println("Introduzca un numero: ");

			numeroIntroducido = dogma.nextInt();

			// compruebo si el numero introducido se encuentra en la tabla con binary search
			// que me devolvera la posicion en la que lo ha encontrado si lo encuentra
			// o una posicion negativa si no lo encuentra
			posicion = Arrays.binarySearch(tabla, numeroIntroducido);

			// si valor de posicion menor a 0 no se encuentra en el array tabla
			if (posicion < 0) {

				// por lo que creo una posicion en la que almacenarlo aumentando la longitud del
				// array en +1
				tabla = Arrays.copyOf(tabla, tabla.length + 1);

				//y añado el numero introducido a la ultima posicion del array 
				tabla[tabla.length - 1] = numeroIntroducido;

				// si valor de posicion mayor a 0 el numero introducido se encuentra en el array tabla
				//por lo que muestro mensaje de error por pantalla
			} else {
				System.out.println("Ya ha introducido ese numero, introduzca uno que no este en la lista. ");
			}

		}

		dogma.close();

		//print de array tabla al final de bucle para comprobar funcionamiento
		System.out.println(Arrays.toString(tabla));

		//mensaje por pantalla de finalizacion de creacion de array
		System.out.println("Array creado. ");

		//bucle que se ejecutara mientras la longitud del array tabla sea mayor a 1
		while (tabla.length > 1) {

			//
			posicionAleatoria1 = (int) (Math.random() * tabla.length);
			numeroA = tabla[posicionAleatoria1];

			System.arraycopy(tabla, posicionAleatoria1 + 1, tabla, posicionAleatoria1,
					tabla.length - posicionAleatoria1 - 1);
			tabla = Arrays.copyOf(tabla, tabla.length - 1);

			if (tabla.length == 1) {
				break;
			}

			posicionAleatoria2 = (int) (Math.random() * tabla.length);
			numeroB = tabla[posicionAleatoria2];

			System.arraycopy(tabla, posicionAleatoria2 + 1, tabla, posicionAleatoria2,
					tabla.length - posicionAleatoria2 - 1);

			mediaAritmetica = (int) ((numeroA + numeroB) / 2);

			tabla[tabla.length - 1] = mediaAritmetica;

			System.out.println(Arrays.toString(tabla));
		}

		System.out.println(Arrays.toString(tabla));

		System.out.println("Su numero de la suerte es: " + (tabla[0]));

	}

}
