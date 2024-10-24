package ejerciciosRepaso;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el tamaño del tablero
        System.out.print("Introduce un número mayor que 0 para el tamaño del tablero: ");
        int n = scanner.nextInt();
        
        // Validar que el número sea mayor que 0
        if (n <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            // Imprimir la parte superior del tablero
            for (int i = 0; i < n; i++) {
                System.out.print(" __");
            }
            System.out.println();
            
            // Imprimir las filas del tablero
            for (int fila = 0; fila < n; fila++) {
                for (int col = 0; col < n; col++) {
                    System.out.print("|__");
                }
                System.out.println("|");
            }
        }
        
        scanner.close();
    }
}