package semana04;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int cantidadComprasAnteriores = 0;
        double montoActualCompra = 0, montoDescuento = 0, montoTotalFinal = 0;

        //montoDescuento = 0;
        Utils.limpiarConsola();
        cantidadComprasAnteriores = Utils.leerEntero("Digite la cantidad de compras anteriores: ");
        montoActualCompra = Utils.leerDoble("Digite el monto de la compra actual: ");

        if (cantidadComprasAnteriores >= 6 && montoActualCompra >= 10000) {
            montoDescuento = montoActualCompra * 0.35;
        }

        montoTotalFinal = montoActualCompra - montoDescuento;

        System.out.print("DETALLE DE ");
        System.out.print("LA FACTURA");
        System.out.println(" :) ");

        System.out.printf("%-15s %12.2f\n", "Monto original", montoActualCompra);
        System.out.printf("%-15s %12.2f\n", "Monto descuento", montoDescuento);
        System.out.printf("%-15s %12.2f\n", "Monto final", montoTotalFinal);
    }
}
