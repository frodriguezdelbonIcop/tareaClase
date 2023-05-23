package ActividadClase;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int monto = sc.nextInt(); 

        System.out.println("Cantidad de billetes necesarios para el monto $" + monto + ":");
        contarBilletes(monto);
	}
	 public static void contarBilletes(int monto) {
	        int[] denominaciones = { 100, 50, 20, 10, 5, 2, 1 };
	        int[] cantidades = new int[denominaciones.length];

	        for (int i = 0; i < denominaciones.length; i++) {
	            if (monto >= denominaciones[i]) {
	                cantidades[i] = monto / denominaciones[i];
	                monto %= denominaciones[i];
	            }
	        }

	        for (int i = 0; i < denominaciones.length; i++) {
	            if (cantidades[i] > 0) {
	                System.out.println("$" + denominaciones[i] + " -> " + cantidades[i]);
	            }
	        }
	    }
}
