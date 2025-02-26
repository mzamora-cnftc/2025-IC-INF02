package semana06;

import generico.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        int n;
        Utils.limpiarConsola();
        n = Utils.leerEntero("¿Hasta dónde quieres llegar hoy?: ");

        System.out.printf("Los número pares de %d hasta 1 son: \n", n);

        for (int i = n; i >= 2; i--) {
            if (i%2==0) {
                System.out.println(i);    
            }
            
        }
    }
}
