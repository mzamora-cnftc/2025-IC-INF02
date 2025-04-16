package semana13;

import generico.Utils;

public class VentaVehiculos {

    public static void imprimirReporte(String titulo, int[][] valores, String[] titulosCols, String[] titulosFilas) {
        Utils.limpiarConsola();
        System.out.println(titulo.toUpperCase());
        System.out.println();
        System.out.print(String.format("%13s", ""));
        for (int i = 0; i < titulosCols.length; i++) {
            System.out.print(String.format("%13s", titulosCols[i]));
        }
        System.out.println();

        for (int i = 0; i < titulosFilas.length; i++) {
            System.out.print(String.format("%13s", titulosFilas[i]));
            for (int j = 0; j < valores[i].length; j++) {
                System.out.printf("%12d ", valores[i][j]);
            }
            System.out.println();
        }

    }

    public static void registrarVenta(String titulo, int[][] valores, String[] titulosCols, String[] titulosFilas) {
        Utils.limpiarConsola();
        System.out.println(titulo.toUpperCase());
        System.out.println();

        int marca, tipo;

        marca = Utils.seleccionarElementoTexto("Seleccione la marca", titulosFilas) - 1;
        tipo = Utils.seleccionarElementoTexto("Seleccione el tipo", titulosCols) - 1;

        valores[marca][tipo] = Utils.leerEntero("Digite el valor: ");

    }

    public static void acumularVenta(String titulo, int[][] valores, String[] titulosCols, String[] titulosFilas) {
        Utils.limpiarConsola();
        System.out.println(titulo.toUpperCase());
        System.out.println();

        int marca, tipo;

        marca = Utils.seleccionarElementoTexto("Seleccione la marca", titulosFilas) - 1;
        tipo = Utils.seleccionarElementoTexto("Seleccione el tipo", titulosCols) - 1;

        valores[marca][tipo] = valores[marca][tipo] + Utils.leerEntero("Digite el valor: ");

    }

    public static String[] cargarMarcas() {
        String[] salida = null;
        int n = Utils.leerEntero("Digite la cantidad de marcas: ");
        salida = new String[n];

        for (int i = 0; i < salida.length; i++) {
            salida[i] = Utils.leerString("Digite la marca #" + (i + 1) + ": ");
        }

        return salida;
    }

    public static String[] cargarTipos() {
        String[] salida = null;
        int n = Utils.leerEntero("Digite la cantidad de tipos de vehículos: ");
        salida = new String[n];

        for (int i = 0; i < salida.length; i++) {
            salida[i] = Utils.leerString("Digite el tipo #" + (i + 1) + ": ");
        }

        return salida;
    }

    public static void main(String[] args) {

        int[][] ventas = null;
        String[] marcas = null;
        String[] tipos = null;
        String[] opcionesMenu = { "Registrar", "Acumular", "Reporte", "Salir" };
        String opcion;
        int indice;

        marcas = cargarMarcas();
        tipos = cargarTipos();
        ventas = new int[marcas.length][tipos.length];

        // imprimirReporte("Reporte de ventas de vehículos", ventas, tipos, marcas);

        do {
            indice = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[indice];

            switch (opcion) {
                case "Registrar":
                    registrarVenta("Registro de ventas de vehículos", ventas, tipos, marcas);
                    Utils.pausar();
                    break;
                case "Acumular":
                    acumularVenta("Acumular de ventas de vehículos", ventas, tipos, marcas);
                    Utils.pausar();
                    break;
                case "Reporte":
                    imprimirReporte("Reporte de ventas de vehículos", ventas, tipos, marcas);
                    Utils.pausar();
                    break;
            }

        } while (!"Salir".equalsIgnoreCase(opcion));

    }
}
