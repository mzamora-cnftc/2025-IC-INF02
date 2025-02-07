package semana03;

import generico.Utils;  // sin esta línea no pueden usar el Utils

public class Ejemplo01 {
    public static void main(String[] args) {

        // limpiar
        Utils.limpiarConsola();

        // Declaración de variab les
        int numero;

        // Inputs
        numero = Utils.leerEntero("Digite un número para evaluar: ");

        // Process
        if (numero < 0) {
            numero = numero * -1;
        }

        // Output
        System.out.println("El valor absoluto es: " + numero);  //sout
    }
}
