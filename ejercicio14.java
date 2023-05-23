package ActividadClase;
import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[10];
        fillArray(array);
        displayArray(array);
	}
	public static void fillArray(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores del array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] array) {
        System.out.println("Índice\tValor");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
    }
}
