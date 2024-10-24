package ejerciciosRepaso;

public class Ejercicio6 {

	public static void main(String[] args) {
		Integer suma = 0;
		for (Integer numero = 3; numero <= 30; numero += 3) {
			suma += numero;
			System.out.print(numero);
			if (numero < 30) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + suma);
	}

}
