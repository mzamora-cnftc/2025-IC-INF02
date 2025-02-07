package semana03;

import generico.Utils;  // sin esto no funciona el Utils

public class Ejemplo02 {
    public static void main(String[] args) {
        // limpiar consola
        Utils.limpiarConsola();
        // Variables
        int numero;

        // inputs
        numero = Utils.leerEntero("Digite número entero: ");

        // process
        if (numero >= 0) {
            // True
            System.out.println("El número " + numero + " es positivo");
        } else {
            //False
            System.out.println("El número " + numero + " es negativo");
        }
    }
}
