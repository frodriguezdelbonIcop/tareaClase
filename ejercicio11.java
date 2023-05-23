package ActividadClase;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
        double A = sc.nextInt();
        char C = 'X';

        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de C es: " + C);

        double suma = N + A;
        System.out.println("La suma de N + A es: " + suma);

        double diferencia = A - N;
        System.out.println("La diferencia de A - N es: " + diferencia);

        int valorNumericoC = (int) C;
        System.out.println("El valor numérico de C es: " + valorNumericoC);

        double sumaTotal = N + A + valorNumericoC;
        System.out.println("La suma de N + A + C es: " + sumaTotal);
	}

}
