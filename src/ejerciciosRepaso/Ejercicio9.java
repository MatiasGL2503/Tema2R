package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean empiezaHola;
		Boolean terminaHastaLuego;
		Boolean finOKAdios;
		do {
			System.out.println("Dime algo bonito...");
			String texto = sc.nextLine();
			empiezaHola = texto.startsWith("hola");
			terminaHastaLuego = texto.endsWith("hastaluego");
			finOKAdios = texto.endsWith("adiós");
			
			if (empiezaHola && (terminaHastaLuego || finOKAdios)) {
				Integer ultimoEspacio = texto.lastIndexOf(" ");
				Integer primerEspacio = texto.indexOf(" ");
				String msg = texto.substring(primerEspacio, ultimoEspacio);
				System.out.println("Entendido: " + msg);
			}
			else {
				System.out.println("No te he entendido. Puedes repetir??");
			}
		}
		while( !(empiezaHola && finOKAdios) );
		
		
		sc.close();


		
		
		
	}
}


	


