package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el tamaño del tablero:");
		Integer tam = sc.nextInt();

		for (Integer colum = 1; colum <= tam; colum++) {
			if (colum == 1) {
				System.out.print(" __");
			}
			else {
				System.out.print("___");
			}
		}
		System.out.println();
		for (Integer fila = 1; fila <= tam; fila++) {
			
			for (Integer colum = 1; colum <= tam; colum++) {
				System.out.print("|__");
			}
			System.out.println("|");
		}
		
		
		sc.close();
			
	



	}

}
