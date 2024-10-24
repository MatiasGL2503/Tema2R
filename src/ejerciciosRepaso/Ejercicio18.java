package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra bonita");
		String palabra = sc.nextLine();
		for (int i = palabra.length(); i > 0 ; i--) {
			String letra = palabra.substring(i-1, i);
			System.out.print(letra);
		}
		sc.close();
	}

}

