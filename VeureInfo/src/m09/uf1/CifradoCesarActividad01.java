package m09.uf1;

import java.util.Scanner;

public class CifradoCesarActividad01 {

	 
	 
	public static void main(String[] args) {
/*
 * Activitat 1

Has de codificar un programa que permeti codificar missatges de text tal i com ho feia Juli Cesar, i un segon programa que us ha de permetre descodificar-los.

En concret, cada programa ha de demanar un nombre (que ser� el despla�ament que aplicar� l�algoritme) i el text que es vulgui codificar o descodificar.

Per reduir la complexitat de tots dos algoritmes, aquests nom�s poden xifrar/desxifrar lletres de l�alfabet en min�scula (del car�cter �a� fins al �z� i l�espai en blanc
 que va en ordre darrere la �z�). No contempleu nombres ni vocals accentuades ni els car�cters �� i ��.

Cada programa ha de mostrar el text codificat (el primer programa) i el text descodificat (en el cas del segon programa).


AMPLIACI� (Obligat per als noDuals).
Feu un tercer programa que descodifiqui entrades utilitzant la �for�a bruta�. El programa nom�s permetr� introduir un text, que te�ricament est� codificat, i ha de mostrar tots els
 possibles resultats de descodificar-lo amb tots els possibles despla�aments.
 */
		Scanner teclat = new Scanner (System.in);
		
		int numero;
		String aux = null;
		String change = null;
		String g;
		int cont=0;
		//boolean letra;
		String correcto = "";
		System.out.println("ingrese las posiciones que desea  desplazar para el cifrado:  ");
		numero = teclat.nextInt(); // para aplicar el nextLine se ha de ingresar un nextLine en caso de querer ingresar un valor String para que lea espacios en blanco
		teclat.nextLine();
		
		
		
		
		//char [] alfabeto  = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'} ;
		String[] alfabeto  = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y","z"} ;

			
		for (int i=0; i<alfabeto.length-1; i++) {
			if(numero>0) {
				correcto = alfabeto[(numero + numero % alfabeto.length)];	
		
		}

		 }
	
		System.out.println("la letra a cifrar en el alfabeto es : "  + alfabeto[numero-1]);
		aux = alfabeto[numero-1];
			
			System.out.println("la letra cifrada ser�a " + alfabeto[numero+numero-1]);
			change = alfabeto[numero+numero-1];
	
			
		System.out.println("Ingrese el texto a cifrar con su eleccion : ");
		g = teclat.nextLine();
		
		
		for (int i=0; i<g.length(); i++) {
				
			g = g.replaceAll(aux, change) ;
		}
		
		System.out.println(" el texto con el car�cter cifrado es: " + g);
		
	}
		
		
		
	}



