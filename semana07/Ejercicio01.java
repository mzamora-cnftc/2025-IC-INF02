package semana07;

import generico.Utils;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        int n;

        do {
            n = Utils.leerEntero("Digite el número: ");
        } while (n % 2 == 0);

        System.out.println("Muchas gracias");

    }
}
