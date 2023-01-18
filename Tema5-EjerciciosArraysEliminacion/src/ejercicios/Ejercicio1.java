package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tabla[] = new int[20];
		
		int indiceBusqueda=0;

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(tabla));
		
		while (indiceBusqueda<tabla.length) {
			{
		
				if (tabla[indiceBusqueda]%2!=0) {
					System.arraycopy(tabla, indiceBusqueda+1, tabla, indiceBusqueda, tabla.length-indiceBusqueda-1);
					tabla=Arrays.copyOf(tabla,tabla.length-1);
				}
			} 
			indiceBusqueda++;
		}
		
		System.out.println(Arrays.toString(tabla));

	}

}
