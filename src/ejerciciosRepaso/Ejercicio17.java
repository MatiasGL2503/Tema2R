package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
//		Realizar un programa que solicite un número N al usuario. N tiene que ser mayor a 2. Si no,
//		volver a solicitarlo.
//		A continuación, mostrar los primeros N números de la serie de Fibonacci. Esta serie se calcula
//		sumando los dos últimos números. Por ejemplo, los 13 primeros números de Fibonacci son:
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 
		Scanner p = new Scanner(System.in);
		Integer numero;
		do {
			System.out.println("Dame un número mayor a 2");
			numero = p.nextInt();
		}
		while (numero <= 2);
		
		Integer a = 0;
		Integer b = 1;
		System.out.print("0, 1");
		
		for (Integer i = 3; i <= numero; i++) {
			Integer siguiente = a + b;
			System.out.print(", " + siguiente);
			a = b;
			b = siguiente;
		}
		
		
		p.close();
		
	}
}
