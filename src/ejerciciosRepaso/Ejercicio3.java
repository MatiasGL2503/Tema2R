package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Integer opcion;
		do {

			System.out.println("*** MENÚ ***");
			System.out.println("\t1.Abrir");
			System.out.println("\t2.Guardar");
			System.out.println("\t3.Modificar");
			System.out.println("\t4.Salir");
			opcion = p.nextInt();

			if (opcion == 1) {
				System.out.println("Abriendo...");
			} else if (opcion == 2) {
				System.out.println("Guardando...");
			} else if (opcion == 3) {
				System.out.println("Modificando...");
			} else if (opcion == 4) {
				System.out.println("Bye bye!!");
			} else {
				System.out.println("Opción no válida.");
			}
		} while (opcion != 4);

		p.close();

	}

}
