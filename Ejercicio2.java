package ActividadClase;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] enteros = new int[5];
		
		for (int i=0;i<enteros.length;i++) {
			System.out.println("ingresa numero");
			enteros[i] = sc.nextInt();
		}
		int suma = 0;

		
		for (int i=0;i<enteros.length;i++) {
			suma += enteros[i];
		}
		int promedio = suma / enteros.length;
		
		ArrayList<Integer> mayores = new ArrayList<>();
		
		for (int i=0;i<enteros.length;i++) {
			if(enteros[i]>promedio) {
				mayores.add(enteros[i]);
			}
		}
		
		int[] resultado = new int[mayores.size()];
		
		for (int i=0;i<mayores.size();i++) {
			resultado[i] = mayores.get(i);
		}
		
		System.out.println("El promedio es: "+promedio);
		
		for (int i=0;i<resultado.length;i++) {
			System.out.println(resultado[i]);
		}

	}

}
