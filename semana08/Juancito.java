import generico.Utils;

class Juancito {

    public static void main(String[] args) {
        int cantidadPapasCompradas, cantidadTotalPapas, cantidadPapasVendidas, costoTotal, ventasTotales, cantidadAulas,
                cantidadPisos, piso, aula, cantidad, opcion;
        boolean hayGuardas, haySiguiente;

        ventasTotales = 0;
        piso = 1;
        hayGuardas = false;
        cantidadPapasVendidas = 0;
        haySiguiente = true;
        cantidadPapasCompradas = Utils.leerEntero("Digite la cantidad de papas que desea comprar al vendedor: ");
        cantidadPisos = Utils.leerEntero("Digite la cantidad de pisos: ");

        cantidadAulas = Utils.leerEntero("Digite la cantidad de aulas: ");
        cantidadTotalPapas = (int) Math.floor((double) cantidadPapasCompradas / 20) * 4 + cantidadPapasCompradas;
        costoTotal = cantidadPapasCompradas * 500;
        System.out.println("Cantidad de papas compradas: " + cantidadPapasCompradas);
        System.out.println("Cantidad de papas para vender: " + cantidadTotalPapas);
        while (piso <= cantidadPisos && !hayGuardas && cantidadTotalPapas > cantidadPapasVendidas) {
            System.out.println("Piso #" + piso);
            aula = 1;
            while (aula <= cantidadAulas && cantidadTotalPapas > cantidadPapasVendidas) {
                System.out.println("Aula #" + aula);

                haySiguiente = Utils.leerBoolean("¿alguien quiere comprar?");
                while (haySiguiente && cantidadTotalPapas > cantidadPapasVendidas) {
                    do {

                        opcion = Utils.leerEntero(
                                "Digite 1 para comprar una papa tostada a 1000 y 2 para comprar dos papás en 1500");
                    } while (!(opcion == 1 || opcion == 2));
                    if (1 == opcion) {
                        cantidadPapasVendidas = cantidadPapasVendidas + 1;
                        ventasTotales = ventasTotales + 1000;
                    } else {
                        cantidadPapasVendidas = cantidadPapasVendidas + 2;
                        ventasTotales = ventasTotales + 1500;
                    }
                    System.out.println("Total de papas vendidas: " + cantidadPapasVendidas);
                    if (cantidadTotalPapas > cantidadPapasVendidas) {

                        haySiguiente = Utils.leerBoolean("¿hay más personas que quieran comprar?");
                    } else {
                        haySiguiente = false;
                    }
                }
                aula = aula + 1;
            }
            piso = piso + 1;
            if (cantidadTotalPapas > cantidadPapasVendidas) {

                hayGuardas = Utils.leerBoolean("¿Hay guardas a la vista (True/False)?");
            }
        }
        System.out.println("Total de papas compradas: " + cantidadPapasCompradas);
        System.out.println("Total de papas para vender: " + cantidadTotalPapas);
        System.out.println("Total de papas vendidas: " + cantidadPapasVendidas);
        System.out.println("Costo de papas compradas: " + cantidadPapasCompradas * 500);
        System.out.println("Monto total vendido: " + ventasTotales);
        System.out.println("Utilidad: " + (ventasTotales - costoTotal));
    }
}
