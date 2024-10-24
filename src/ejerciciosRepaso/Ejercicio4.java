package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4 {

	private static final Double DTO_1 = 0.4;
	private static final Double DTO_2 = 0.2;
	private static final Double DTO_3 = 0.1;

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime el precio");
		Double precio = p.nextDouble();
		System.out.println("Dime unidades");
		Integer unidades = p.nextInt();

		Double porcentajeDto = 0.0;
		if (unidades > 100) {
			porcentajeDto = DTO_1;
		} else if (unidades >= 25) {
			porcentajeDto = DTO_2;
		} else if (unidades >= 10) {
			porcentajeDto = DTO_3;
		}
		Double subtotal = unidades * precio;
		Double descuento = subtotal * porcentajeDto;
		Double total = subtotal - descuento;
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
		p.close();
	}

}
