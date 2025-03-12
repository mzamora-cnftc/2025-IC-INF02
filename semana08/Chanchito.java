import generico.Utils;

public class Chanchito {

    public static void main(String[] args) {
        double saldo = 0, monto, totalDepositos = 0, totalRetiros=0;
        int opcionMenu;
        String movimientos = String.format("%-10s %10s %10s\n", "DETALLE", "DEPOSITOS", "RETIROS");

        do {
            Utils.limpiarConsola();
            System.out.printf("%2d %-20s\n", 1, "Ver saldo");
            System.out.printf("%2d %-20s\n", 2, "Depositar");
            System.out.printf("%2d %-20s\n", 3, "Retirar");
            System.out.printf("%2d %-20s\n", 4, "Movimientos");
            System.out.printf("%2d %-20s\n", 0, "Salir");
            opcionMenu = Utils.leerRangosEnteros("Digite la opción: ", 0, 4);
            Utils.limpiarConsola();
            switch (opcionMenu) {
                case 0:
                    System.out.println("Hasta la vista, baby!");
                    break;
                case 1:
                    System.out.println("SALDO");
                    System.out.printf("Su saldo es de %.2f\n", saldo);
                    Utils.pausar();
                    break;
                case 2:
                    System.out.println("DEPOSITAR");
                    monto = Utils.leerDoble("Digite el monto a depositar: ");
                    saldo = saldo + monto;
                    totalDepositos += monto;
                    movimientos = movimientos + String.format("%-10s %10.2f %-10s\n", "DEPOSITAR", monto, "");
                    break;
                case 3:
                    System.out.println("RETIRAR");
                    System.out.printf("Límite para retirar %.2f\n", saldo);
                    monto = Utils.leerRangosEnteros("Digite el monto a retirar: ", 0, (int) saldo);
                    totalRetiros += monto;
                    movimientos = movimientos + String.format("%-10s %10s %10.2f\n", "RETIRAR", "", monto);
                    saldo = saldo - monto;
                    break;
                case 4:
                    System.out.println("MOVIMIENTOS");
                    movimientos = movimientos + String.format("%-10s %10.2f %10.2f\n", "TOTALES", totalDepositos, totalRetiros);
                    System.out.println(movimientos);
                    System.out.printf("TOTAL FINAL ES DE %.2f\n",saldo);
                    Utils.pausar();
                    break;
                default:
                    break;
            }

        } while (opcionMenu != 0);

    }
}