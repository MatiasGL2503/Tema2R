package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime un numero");
		Integer num1 = p.nextInt();
		System.out.println("Dime otro numero");
		Integer num2 = p.nextInt();
		Integer opcion;
		do {
			System.out.println("**MENU**" + "\n	1.Sumar" + "\n	2.Restar" + "\n	3.Multiplicar" + "\n	4.Dividir" + "\n	0.Salir");
			opcion = p.nextInt();
			if (opcion == 1) {
				System.out.println("El resultado es: " + (num1 + num2));
			} else if (opcion == 2) {
				System.out.println("El resultado es: " + (num1 - num2));
			} else if (opcion == 3) {
				System.out.println("El resultado es: " + (num1 * num2));
			} else if (opcion == 4) {
				if (num2 != 0) {
					System.out.println("El resultado es: " + (num1 / num2));
				} else {
					System.out.println("No puedo dividir entre 0");
				}
			} else {
				System.out.println("No es posible");
			}
		} while (opcion != 0);

		p.close();

	}

}
