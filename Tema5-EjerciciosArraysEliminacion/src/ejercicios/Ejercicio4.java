package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int tabla [] = new int [20];
		
		int numeroIntroducido;
		
		int posicion=0;
		
		Scanner dogma = new Scanner(System.in);
		
		for (int i=0; i<tabla.length; i++) {
			tabla[i]= (int) (Math.random()*11);
		}
		
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("Introduzca un numero entero: ");
		numeroIntroducido=dogma.nextInt();
		
		while (posicion<tabla.length) {
			if (tabla[posicion]>numeroIntroducido) {
				System.arraycopy(tabla,posicion+1,tabla,posicion,tabla.length-posicion-1);
				Arrays.copyOf(tabla,tabla.length-1);
			} else {
				posicion++;
			}
		}
		
		System.out.println(Arrays.toString(tabla));

	}

}
