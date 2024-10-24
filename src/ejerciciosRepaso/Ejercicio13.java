package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
//		Realizar un programa que de manera continua vaya pidiendo frases al usuario. El programa
//		deberá ir guardando todas las frases en una variable. Cuando el usuario escriba la frase “FIN”,
//		el programa terminará y mostrará por consola todo el texto que ha ido almacenando.
//		La palabra “FIN” se podrá escribir de cualquier forma. Por ejemplo “Fin” o “fin”, etc. 
		Scanner p = new Scanner(System.in);
		String frase;
		String acumulado = "";
		
		do {
			System.out.println("Indica una frase");
			frase = p.nextLine();
			if (!frase.equalsIgnoreCase("FIN")) {
				acumulado = acumulado + frase + "\n";
			}
			
		} while (!frase.equalsIgnoreCase("FIN"));
		
		System.out.println(acumulado);
		
		p.close();
		
		
		
	}
}

		
		
		