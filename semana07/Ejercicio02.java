package semana07;

import generico.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        int saldo, retiro;

        saldo = Utils.leerEntero("Digite su saldo inicial: ");

        do {
            System.out.printf("Su saldo es: %d\n", saldo);
            retiro = Utils.leerEntero("Digite el montor a retirar: ");
            saldo = saldo - retiro;

        } while (saldo > 0);
        
        if (saldo == 0) {
            System.out.println("Se acabaron los fondos");
        } else {
            System.out.println("Fondos insuficientes, más suerte la próxima vez");
        }

    }
}
