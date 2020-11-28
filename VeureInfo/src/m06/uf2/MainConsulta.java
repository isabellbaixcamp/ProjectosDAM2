package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
	
		Scanner ask = new Scanner (System.in);
		
		String name, ident, agno,  direct, sex, postal, pobla;
		
		boolean respuesta = false;
		
		int opcion;
		
		MySQLFirts tabla = new MySQLFirts (null, null, null, null, null, null, null);
		
		System.out.println("la tabla sobre la que se trabaja es la siguiente");
		tabla.mostrarTabla();
		
		System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
				"desea insertar alumno (1)" + '\n' + " desea modificar alumno (2)" + '\n' +
				"desea eliminar alumno  (3)" +  '\n' + " realizar alguna consulta sobre un elemento (4)" + '\n' + "modificar poblacion (5)" + '\n' + "salir (6)");
		
		opcion = ask.nextInt();
		
		while (opcion < 5) {
			switch (opcion) {
			
			case 1:
				System.out.println(" ingrese nombre");
				name = ask.next();
				
				System.out.println(" ingrese DNI");
				ident = ask.next();
				
				System.out.println(" ingrese any de nacimiento");
				agno = ask.next();
				
				System.out.println(" ingrese direccion postal");
				direct = ask.next();
				
				System.out.println(" ingrese sexo");
				sex = ask.next();
				
				System.out.println(" ingrese c�digo postal");
				postal = ask.next();
				
				System.out.println(" ingrese poblacion");
				pobla = ask.next();

				
				MySQLFirts nueva = new MySQLFirts (name , ident, agno, direct, sex, postal, pobla);
			
				nueva.metodoInsertar();
				nueva.mostrarTabla();
				break;
				
			case 2:
				//String modifica = ("UPDATE  ");
				String eleccion;
				String valor;
				String nuevoValor;
				System.out.println(" ingrese la columna que desea modificar");
				eleccion = ask.next();
				System.out.println(" ingrese el numero de la fila que desea modificar  ");
				valor = ask.next();
				System.out.println(" ingrese el nuevo valor a modificar");
				nuevoValor = ask.next();
				String modifica = ("UPDATE ALUMNE SET " + eleccion + " = " + nuevoValor + "WHERE " + eleccion + " = " + valor);
				//if (eleccion.equalsIgnoreCase(name)) {
				tabla.metodoModificar(eleccion, valor, nuevoValor, modifica);
				tabla.mostrarTabla();	
				//}
				break;
				
			case 3:
				String elemento;
				String column;
				System.out.println(" ingrese la columna a eliminar");
				column = ask.next();
				System.out.println(" ingrese el elemento a eliminar");
				elemento = ask.next();
				
				tabla.metodoBorrar(elemento, column);
				tabla.mostrarTabla();
				break;
				
			case 4:
				String elem;
				String col;
				//System.out.println(" ingrese la columna a consultar");
				//col = ask.next();
				
				System.out.println(" ingrese el elemento a consultar");
				elem = ask.next();
				
				tabla.metodoVerificaElemento(elem);
				
			}
			
		}
		/*
		 * 
		System.out.println(" ingrese nombre");
		name = ask.next();
		
		System.out.println(" ingrese DNI");
		ident = ask.next();
		
		System.out.println(" ingrese any de nacimiento");
		agno = ask.nextInt();
		
		System.out.println(" ingrese direccion postal");
		direct = ask.next();
		
		System.out.println(" ingrese sexo");
		sex = ask.next();
		
		System.out.println(" ingrese c�digo postal");
		postal = ask.nextInt();
		
		System.out.println(" ingrese poblacion");
		pobla = ask.next();

		
		MySQLFirts nueva = new MySQLFirts (name , ident, agno, direct, sex, postal, pobla);
	
		//nueva.metodoInsertar();
		
		*/
		
	}
}