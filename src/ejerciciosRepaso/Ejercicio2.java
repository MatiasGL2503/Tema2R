package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime 3 ciudades en 3 líneas diferentes");
		String ciudad1 = p.nextLine();
		String ciudad2 = p.nextLine();
		String ciudad3 = p.nextLine();
		Integer longCiudad1 = ciudad1.length();
		Integer longCiudad2 = ciudad2.length();
		Integer longCiudad3 = ciudad3.length();
		if (longCiudad1 < longCiudad2 && longCiudad1 < longCiudad3) {
			System.out.println(ciudad1);
			if (longCiudad2 < longCiudad3) {
				System.out.println(ciudad2);
				System.out.println(ciudad3);
			} else {
				System.out.println(ciudad3);
				System.out.println(ciudad2);
			}
		} else if (longCiudad2 < longCiudad1 && longCiudad2 < longCiudad3) {
			System.out.println(ciudad2);
			if (longCiudad1 < longCiudad3) {
				System.out.println(ciudad1);
				System.out.println(ciudad3);
			} else {
				System.out.println(ciudad3);
				System.out.println(ciudad1);
			}
		} else {
			System.out.println(ciudad3);
			if (longCiudad1 < longCiudad2) {
				System.out.println(ciudad1);
				System.out.println(ciudad2);
			} else {
				System.out.println(ciudad2);
				System.out.println(ciudad1);
			}
		}

		p.close();
	}

}
