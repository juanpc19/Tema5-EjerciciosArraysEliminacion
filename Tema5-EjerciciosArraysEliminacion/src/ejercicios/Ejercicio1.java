package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tabla[] = new int[20];
		
		//para avanzar posiciones en el array
		int posicion=0;

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(tabla));
		
		//mientras queden posiciones por recorrer en la tabla
		while (posicion<tabla.length) {
			
				//si es par 
				if (tabla[posicion]%2!=0) {
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
