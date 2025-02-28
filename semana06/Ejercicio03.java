package semana06;

import generico.Utils;

public class Ejercicio03 {

    public static void main(String[] args) {
        int acumulador = 1, limiteFactorial;

        Utils.limpiarConsola();
        limiteFactorial = Utils.leerEntero("Digite el límite del factorial: ");

        for (int i = 1; i <= limiteFactorial; i++) {
            acumulador *= i;
            //acumulador = acumulador * i;
        }

        System.out.printf("El factorial es: %d\n", acumulador);


    }
}