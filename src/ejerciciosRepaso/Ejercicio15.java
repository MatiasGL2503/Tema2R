package ejerciciosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
//		Realiza un programa que sea un juego de adivinanza. El programa generará de manera
//		aleatoria un número del 0 al 9. Le preguntará al usuario que intente averiguarlo. Si no lo
//		consigue, seguirá preguntando hasta que lo haga. Cuando el usuario adivine el número, el
//		programa terminará mostrando la puntuación obtenida. La puntuación se obtiene restando a
//		10 el número de intentos que el usuario a necesitado.
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(0, 10);
		Integer numero;
		Integer intentos = 0;
		System.out.println("Intenta adivinar el número que he pensado:");
		do {
			numero = sc.nextInt();
			if (numero != aleatorio && intentos < 9) {
				System.out.println("No has acertado!! Intenta de nuevo:");
				intentos ++;
			}
			else if (numero != aleatorio) {
				System.out.println("GAME OVER");
				intentos ++;
			}
			else {
				System.out.println("Felicidades!!");
			}
		} while (numero != aleatorio && intentos < 10);

		System.out.println("Puntuación: " + (10 - intentos));
		sc.close();
	}
	
	
}
