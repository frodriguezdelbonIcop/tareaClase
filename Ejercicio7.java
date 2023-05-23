package ActividadClase;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String texto = sc.next();

        int cantidadPalabras = contarPalabras(texto);
        System.out.println("El número total de palabras en el texto es: " + cantidadPalabras);

	}
    public static int contarPalabras(String texto) {
        String[] palabras = texto.split("\s+"); 
        int contador = 0;
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) { 
                contador++;
            }
        }

        return contador;
    }
}
