package semana06;

import generico.Utils;

public class Ejemplo056 {

    public static void main(String[] args) {
        int cantidadEstudiantes = 0, cantidadExamenes = 0, aprobados = 0, reprobados = 0, ampliados = 0;
        double nota = 0, sumaNotas = 0, promedio = 0;

        Utils.limpiarConsola();
        cantidadEstudiantes = Utils.leerEntero("Digite la cantidad de estudiantes: ");
        cantidadExamenes = Utils.leerEntero("Digite la cantidad de exámenes: ");

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante #" + (i + 1));

            sumaNotas = 0;
            for (int j = 0; j < cantidadExamenes; j++) {
                nota = Utils.leerDoble("Digite la nota del examen #" + (j + 1) + ": ");
                sumaNotas += nota;
            }
            promedio = sumaNotas / cantidadExamenes;
            System.out.printf("Su promedio es: %.2f\n", promedio);

            if (promedio >= 70) {
                aprobados++;
            } else if (promedio >= 60) {
                ampliados++;
            } else {
                reprobados++;
            }

        }

        System.out.printf("%-15s %2d\n", "Aprobados", aprobados);
        System.out.printf("%-15s %2d\n", "Reprobados", reprobados);
        System.out.printf("%-15s %2d\n", "Ampliados", ampliados);

    }
}