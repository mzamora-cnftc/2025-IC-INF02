package semana03;

import generico.Utils;

public class Ejercicio14 {

    public static void main(String[] args) {
        double horaEntrada, horaSalida, horasTrabajadas, horasExtra, tarifa, salarioRegular, salarioExtra, salarioTotal;

        Utils.limpiarConsola();

        // Variables de entrada
        horaEntrada = Utils.leerDoble("Digite la hora de entrada: ");
        horaSalida = Utils.leerDoble("Digite la hora de salida: ");
        tarifa = Utils.leerDoble("Digite el monto de la tarifa: ");

        // Proceso
        horasTrabajadas = horaSalida - horaEntrada;

        if (horasTrabajadas > 8) {
            horasExtra = horasTrabajadas - 8;
            horasTrabajadas = 8;
        } else {
            horasExtra = 0;
        }

        salarioRegular = horasTrabajadas * tarifa;
        salarioExtra =  horasExtra * 1.5 * tarifa;
        salarioTotal = salarioRegular + salarioExtra;

        // Salida
        System.out.println("Planilla");
        System.out.printf("%-20s %12.2f\n", "Salario base",salarioRegular);
        System.out.printf("%-20s %12.2f\n", "Salario extra",salarioExtra);
        System.out.printf("%-20s %12.2f\n", "Salario total",salarioTotal);



    }
}