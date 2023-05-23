package ActividadClase;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resultado = sumarNaturales(N);
        System.out.println("La suma de los primeros " + N + " números naturales es: " + resultado);

	}
    public static int sumarNaturales(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
