package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
//		Realizar un programa que genere contraseñas del siguiente modo: pedirá al usuario una
//		palabra de al menos 8 caracteres. Si no tiene esa longitud, volverá a pedir otra hasta que el
//		usuario indique una de al menos esa longitud. Después, el programa cambiará las letras de esa
//		palabra por números siguiendo estas reglas:
//		 a = 4
//		 e = 3
//		 i = 1
//		 o = 0
//		 t = 7
//		El resultado se mostrará por consola.
		Scanner p = new Scanner (System.in);
		String palabra;
		
		do {
			System.out.println("Dime una palabra de al menos 8 caracteres");
			palabra = p.nextLine();
			
		} while (palabra.length()<8);
		palabra = palabra.replaceAll("a", "4");
		palabra = palabra.replaceAll("e", "3");
		palabra = palabra.replaceAll("i", "1");
		palabra = palabra.replaceAll("o", "0");
		palabra = palabra.replaceAll("t", "7");
		
		System.out.println("contraseña " + palabra);
		p.close();
	}

}
