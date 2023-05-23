package ActividadClase;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String codigo = sc.next();
        String isbn = calcularISBN(codigo);
        System.out.println("ISBN resultante: " + isbn);
	}
    public static String calcularISBN(String codigo) {
        int suma = 0;
        int factor = 1;
        for (int i = 0; i < codigo.length(); i++) {
            int digito = Character.getNumericValue(codigo.charAt(i));
            suma += factor * digito;
            factor++;
        }
        int resto = suma % 11;
        int digitoVerificador;
        if (resto == 0) {
            digitoVerificador = 0;
        } else {
            digitoVerificador = 11 - resto;
        }
        return codigo + digitoVerificador;
    }
}
