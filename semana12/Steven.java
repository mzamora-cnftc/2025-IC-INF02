package semana12;

import generico.Utils;

public class Steven {


    public static void imprimirInformacion(String[] nombres, double[] salarioBrutos, double[] salariosNetos) {

        System.out.printf("%-20s %-13s %-13s\n", "Nombre", "Salario Bruto", "Salario Neto");

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-20s %13.3f %13.3f\n", nombres[i], salarioBrutos[i], salariosNetos[i]);
        }
    }

    public static void procesarSalario(double[] salarioBrutos, double[] salariosNetos, double limite, double impuesto) {
        double excedente, montoImpuesto;

        for (int i = 0; i < salariosNetos.length; i++) {
            if (salarioBrutos[i] > limite) {
                excedente = salarioBrutos[i] - limite;
                montoImpuesto = excedente * impuesto;
                salariosNetos[i] = salarioBrutos[i] - montoImpuesto;
            } else {
                salariosNetos[i] = salarioBrutos[i];
            }
        }
    }

    public static void leerDatos(String[] nombres, double[] salariosBrutos) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Digite la información del empleado #" + (i + 1) + ":");
            nombres[i] = Utils.leerString("Digite el nombre: ");
            salariosBrutos[i] = Utils.leerDoble("Digite el salario bruto: ");
        }
    }

    public static void main(String[] args) {
        int n;
        double limite, impuesto;
        // acá creo los controles remotos para manipular los arreglos (no hay arreglo
        // todavía)
        double[] salarioNetos, salariosBrutos;
        String[] nombresEmpleado;

        n = Utils.leerEntero("Digite la cantidad de empleados: ");

        limite = Utils.leerDoble("Digite el límite de exoneración: ");

        impuesto = Utils.leerDoble("Digite el porcentaje de impuesto: ");

        // estoy creando el arreglo y lo asigno al control remoto
        salarioNetos = new double[n];
        salariosBrutos = new double[n];
        nombresEmpleado = new String[n];

        leerDatos(nombresEmpleado, salariosBrutos);
        procesarSalario(salariosBrutos, salarioNetos, limite, impuesto);
        imprimirInformacion(nombresEmpleado, salariosBrutos, salarioNetos);

    }
}
