package m09.uf1;

import java.util.Scanner;

public class CifradoCesarActividad01 {

	 static String [] codificacion (String [] alfabeto, int numero) {
		 Scanner teclat = new Scanner (System.in);
		 String [] modificar;
		 int num = numero;
		 modificar = alfabeto;
		 
		 for (int i=0; i<alfabeto.length; i++) {
			 modificar[i] = [num];
			 
		 }
		 
	 }
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
		char aux;
		//String g;
		
		
		System.out.println("ingrese las posiciones que desea  cifrar:  ");
		numero = teclat.nextInt();
		
		
		
		char [] alfabeto  = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'} ;
		//String[] alfabeto  = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y","z"} ;
		
		
		 //llenadoArray	
		for (int i=0; i<alfabeto.length-1; i++) {
		 }
		System.out.println("la letra a cifrar en el alfabeto es : "  + alfabeto[numero-1]);
		aux = alfabeto[numero-1];
			for (int i=0; i<alfabeto.length-1; i++) {				
		}
			System.out.println("la letra cifrada ser�a " + alfabeto[numero+numero-1]);
	}
}

