package ActividadClase;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        
        int resultado = numeroFibo(numero);
        System.out.println("El numero " + numero + " de Fibonacci es: " + resultado);

	}
    public static int numeroFibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return numeroFibo(n - 1) + numeroFibo(n - 2);
        }
    }
}
