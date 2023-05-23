package ActividadClase;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        
        if(esCapicua(numero)) {
            System.out.println(numero+ " es capicua");
        }else{
        	System.out.println(numero+ " no es capicua");
        }



	}
    public static boolean esCapicua(int numero) {
        int reverso = 0;
        int org = numero;

        while (numero > 0) {
            int digito = numero % 10;
            org = reverso * 10 + digito;
            numero /= 10;
        }

        return org == reverso;
    }
}
