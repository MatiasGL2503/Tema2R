package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Boolean inicio;
		Boolean fin;
		do {
			System.out.println("Dime algo bonito...");
			String texto = p.nextLine();
			inicio = texto.startsWith("hola");
			fin = texto.endsWith("hastaluego");
			if (inicio && fin) {
				Integer ultimoEspacio = texto.lastIndexOf(" ");
				Integer primerEspacio = texto.indexOf(" ");
				String mensaje = texto.substring(primerEspacio, ultimoEspacio);
				System.out.println("Entendido: " + mensaje);
			}
			else {
				System.out.println("No te he entendido. Puedes repetir??");
			}
		}
		while(!inicio || !fin);
		
		
		p.close();
		
		
		
	}
}
