package ActividadClase;
import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud = 10;
        double[] notas = new double[longitud];
        String[] nombres = new String[longitud];
        String[] resultados = new String[longitud];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los nombres y las notas de los alumnos:");

        for (int i = 0; i < longitud; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            boolean notaValida = false;
            while (!notaValida) {
                System.out.print("Nota del alumno " + (i + 1) + ": ");
                double nota = sc.nextDouble();
                sc.nextLine(); 

                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    notaValida = true;
                } else {
                    System.out.println("Error: la nota debe estar entre 0 y 10.");
                }
            }

            if (notas[i] >= 0 && notas[i] < 5) {
                resultados[i] = "suspenso";
            } else if (notas[i] >= 5 && notas[i] < 7) {
                resultados[i] = "bien";
            } else if (notas[i] >= 7 && notas[i] < 9) {
                resultados[i] = "notable";
            } else {
                resultados[i] = "sobresaliente";
            }
        }

        System.out.println("\nResultados:");

        for (int i = 0; i < longitud; i++) {
            System.out.println("Alumno: " + nombres[i]);
            System.out.println("Nota: " + notas[i]);
            System.out.println("Resultado: " + resultados[i]);
            System.out.println();
        }
	}

}
