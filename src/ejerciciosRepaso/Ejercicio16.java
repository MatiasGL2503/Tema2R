package ejerciciosRepaso;


import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
//		Realizar un programa que solicite al usuario una palabra por consola. A continuación, mostrar
//		por consola las diferentes letras de esa palabra en cada línea. Por ejemplo, si la palabra
//		indicada por el usuario es “indonesia” el resultado debería ser:
//		i
//		n
//		d
//		o
//		n
//		e
//		s
//		i
//		a 
		Scanner p = new Scanner(System.in);
		String palabra;
		System.out.println("Dime una palabra ");
		palabra = p.nextLine();
		
		for (Integer i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.substring(i, i+1));
		}
			
		 
		p.close();
	}

}
