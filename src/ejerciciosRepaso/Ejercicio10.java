package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
//		Solicitar al usuario una dirección web que tendrá este formato:
//			PROTOCOLO://PARTE1.PARTE2.PARTE3
//			Por ejemplo:
//			http://www.google.com
//			Debemos dividir esa dirección e imprimirla por consola de este modo:
//			http://
//			www
//			google
//			com 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Indica una URL:");
			String url = sc.nextLine();
			Integer posicionBarras = url.indexOf("://");
			Integer posicionPunto1 = url.indexOf(".");
			Integer posicionPunto2 = url.lastIndexOf(".");
			if (posicionBarras != -1 && posicionPunto1 != 1 && posicionPunto2>posicionPunto1) {
				System.out.println(url.substring(0, posicionBarras+3));
				System.out.println(url.substring(posicionBarras+3, posicionPunto1));
				System.out.println(url.substring(posicionPunto1+1, posicionPunto2));
				System.out.println(url.substring(posicionPunto2+1));
				break;
			}
			else {
				System.out.println("El formato de la URL no es correcta.");
			}
		}
		
		sc.close();
		
		
		
		
		
	}
}

