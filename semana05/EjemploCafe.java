package semana05;

import generico.Utils;

public class EjemploCafe {

    // constante
    public static double PRECIO_POR_CAJUELA = 1011.22;

    public static void main(String[] args) {
        String nombre;
        char tipo;
        int unidad;
        double precioPorTipo = 0, cantidadCajuelas, castigo = 0, premio = 0, total = 0;
        boolean alquiloCanasto;

        Utils.limpiarConsola();
        nombre = Utils.leerString("Digite el nombre: ");
        tipo = Utils.leerCaracter("Digite el tipo de café [a|b|c|d]: ");
        unidad = Utils.leerRangosEnteros("Seleccione la unidad:\n 1 - Cajuelas\n 2 - Kilos\n 3 - Cuartillos", 1, 3);
        cantidadCajuelas = Utils.leerDoble("Digite la cantidad: ");
        alquiloCanasto = Utils.leerBoolean("Alquiló canasto");

        switch (unidad) {
            case 2:
                cantidadCajuelas = cantidadCajuelas / 12.65;
                break;
            case 3:
                cantidadCajuelas = cantidadCajuelas / 4;
                break;
        }

        tipo = Character.toLowerCase(tipo);

        switch (tipo) {
            case 'a':
                precioPorTipo = PRECIO_POR_CAJUELA * 1.1;
                if (cantidadCajuelas >= 20) {
                    premio = 10000;
                }
                break;
            case 'b':
                precioPorTipo = PRECIO_POR_CAJUELA;
                if (cantidadCajuelas >= 20) {
                    premio = 5000;
                }
                break;
            case 'c':
                precioPorTipo = PRECIO_POR_CAJUELA * 0.925;
                break;
            case 'd':
                precioPorTipo = PRECIO_POR_CAJUELA * 0.925;
                castigo = 2000;
                break;

        }

        total = cantidadCajuelas * precioPorTipo - castigo + premio;
        if (alquiloCanasto) {
            total = total - 1000;
        }

        System.out.printf("Muchas gracias, el total es ¢%.2f\n", total);

    }

}