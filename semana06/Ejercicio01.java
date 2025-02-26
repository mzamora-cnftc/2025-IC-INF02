package semana06;

import generico.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        int n;
        Utils.limpiarConsola();
        n = Utils.leerEntero("¿Hasta dónde quieres llegar hoy?: ");

        System.out.printf("Los número pares de 1 hasta %d son: \n", n);

        for (int i = 2; i <= n; i+=2) {
            System.out.println(i);
        }
    }
    
}