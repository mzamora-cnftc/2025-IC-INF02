package semana06;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int acumulador = 0, limite, numero;
        double promedio;

        //numero = (int) 25.5;

        limite = Utils.leerEntero("Digite la cantidad de datos: ");

        for (int i = 0; i < limite; i++) {
            numero = Utils.leerEntero(String.format("Digite el valor #%02d: ", (i+1)));
            acumulador = acumulador + numero;
        }

        promedio = (double) acumulador / limite;
        System.out.printf("El promedio es: %.2f\n", promedio);
    }
}
