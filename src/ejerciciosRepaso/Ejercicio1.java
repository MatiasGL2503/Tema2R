package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = p.nextLine();
		System.out.println("Dime ne que año naciste");
		Integer año = p.nextInt();
		Integer edadFutura = 2030 - año;
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + edadFutura + " años.");
		p.close();
	}

}
