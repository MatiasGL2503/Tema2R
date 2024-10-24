package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Integer numero;
		do {
			System.out.println("Indica un número:");
			numero = p.nextInt();
			if (numero > 0 && numero <= 10) {

				Integer suma = 0;
				for (int i = numero; i <= numero * 10; i += numero) {
					suma = suma + i;
					if (i < numero * 10) {
						System.out.print(i + "+");
					} else {
						System.out.print(i);
					}
				}
				System.out.println(" = " + suma);
			} else if (numero < 0 || numero > 10) {
				System.out.println("Número no correcto");
			}
		} while (numero != 0);

		p.close();
	}

}
