package semana07;

import generico.Utils;

public class Ejercicio05 {

    public static void main(String[] args) {
        int año;
        boolean esMultiplo4, esMultiplo100, esMultiplo400;

        Utils.limpiarConsola();

        año = Utils.leerEntero("Digite el año: ");

        while (año > 0) {
            esMultiplo4 = año % 4 == 0;
            esMultiplo100 = año % 100 == 0;
            esMultiplo400 = año % 400 == 0;

            if ((esMultiplo4 && !esMultiplo100) || (esMultiplo4 && esMultiplo400)) {
                System.out.println("Es un año bisiesto");
            } else {
                System.out.println("No es un año bisiesto");
            }

            año = Utils.leerEntero("Digite el año: ");
        }

    }
}