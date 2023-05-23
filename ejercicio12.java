package ActividadClase;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        String mensajePosNeg = (C >= 0) ? "C es positivo" : "C es negativo";
        System.out.println(mensajePosNeg);

        String mensajeParImpar = (C % 2 == 0) ? "C es par" : "C es impar";
        System.out.println(mensajeParImpar);

        String mensajeMultiplo5 = (C % 5 == 0) ? "C es múltiplo de 5" : "C no es múltiplo de 5";
        System.out.println(mensajeMultiplo5);

        String mensajeMultiplo10 = (C % 10 == 0) ? "C es múltiplo de 10" : "C no es múltiplo de 10";
        System.out.println(mensajeMultiplo10);

        String mensajeMayorMenor = (C > 100) ? "C es mayor que 100" : (C < 100) ? "C es menor que 100" : "C es igual a 100";
        System.out.println(mensajeMayorMenor);
	}

}
