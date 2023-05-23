package ActividadClase;
import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        StringBuilder result = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int position;

        System.out.println("Ingrese las posiciones del array (-1 para terminar):");

        while (true) {
            System.out.print("Posición: ");
            position = sc.nextInt();

            if (position == -1) {
                break;
            }

            if (position >= 0 && position < vowels.length) {
                result.append(vowels[position]);
            } else {
                System.out.println("Error: posición inválida.");
            }
        }

        System.out.println("Cadena resultante: " + result.toString());

	}

}
