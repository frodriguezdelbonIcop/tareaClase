package ActividadClase;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String password1 = sc.next();
        
        
        
        
        System.out.println("La contraseña '" + password1 + "' es segura? " + esContrasenaSegura(password1));
       
    }
    
    public static boolean esContrasenaSegura(String contra) {
        int letrasMayusculas = 0;
        int letrasMinusculas = 0;
        int digitosNumericos = 0;
        
        if (contra.length() < 8) {
            return false;
        }
        
        for (int i = 0; i < contra.length(); i++) {
            char c = contra.charAt(i);
            
            if (Character.isUpperCase(c)) {
                letrasMayusculas++;
            }
            
            if (Character.isLowerCase(c)) {
                letrasMinusculas++;
            }
            
            if (Character.isDigit(c)) {
                digitosNumericos++;
            }
            
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        
        return letrasMayusculas >= 2 && letrasMinusculas >= 3 && digitosNumericos >= 2;
    }
}
