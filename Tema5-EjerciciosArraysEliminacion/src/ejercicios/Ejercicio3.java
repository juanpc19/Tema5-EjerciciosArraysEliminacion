package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		int tabla[] = new int[10];

		String seleccion = "";

		int valor = 0;

		// variable en la que guardare la posicion a comprobar
		int posicion = 0;

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 101);
		}

		System.out.println(Arrays.toString(tabla));

		do {
			System.out.println("Seleccione una opcion del siguiente menu: ");
			System.out.println("a. Mostrar valores. ");
			System.out.println("b. Eliminar valores. ");
			System.out.println("c. Salir. ");

			seleccion = dogma.next();
			seleccion=seleccion.toLowerCase();
			// el cambia mayus no funciona?

		

			// switch que evaluara a seleccion
			switch (seleccion) {

			// print de array tabla en caso "a"
			case "a" -> {
				System.out.println(Arrays.toString(tabla));
			}
			// peticion de valores para variables v y p al usuario en caso "b"
			case "b" -> {
				System.out.println("Introduzca un valor a eliminar del array: ");
				valor = dogma.nextInt();

				// bucle que se ejecutara mientras que posicion sea menor que longitud de array
				// tabla
				while (posicion < tabla.length) {

					// condicion que establece si valor se encuentra en la posicion actual del array
					if (valor == (tabla[posicion])) {
						// copio el array tabla desde la posicion siguiente a la posicion actual sobre
						// si mismo por una longitud
						// igual a la de la tabla menos la posicion -1
						// eliminando la posicion actual y dejando la ultima con valor por defecto 0
						System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
						// copio el array eliminando la ultima posicion con tabla.length-1
						tabla = Arrays.copyOf(tabla, tabla.length - 1);
					} else {
						// si posicion contiene un elemento diferente a valor paso a la siguiente
						// posicion del array
						posicion++;
					}

				}

			}
			}
			// Establezco condicion mientras que seleccion sea diferente a "C"
			// que de cumplirse mantendra el bucle en ejecucion
		} while (!seleccion.equals("c"));

		dogma.close();
	}

}
