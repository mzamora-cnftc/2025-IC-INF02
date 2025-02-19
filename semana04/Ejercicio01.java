package semana04;

import generico.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        int dia, mes, anno, diaSiguiente, mesSiguiente, annoSiguiente, ultimoDia;

        Utils.limpiarConsola();

        dia = Utils.leerEntero("Digite el día: ");
        mes = Utils.leerEntero("Digite el mes: ");
        anno = Utils.leerEntero("Digite el año: ");

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                ultimoDia = 28;
            } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                ultimoDia = 31;
            } else {
                ultimoDia = 30;
            }

            if (dia >= 1 && dia <=  ultimoDia) {
                //dia correcto
                if (dia == ultimoDia) {
                    if (mes == 12) {
                        diaSiguiente = 1;
                        mesSiguiente = 1;
                        annoSiguiente = anno + 1;
                    } else {
                        diaSiguiente = 1;
                        mesSiguiente = mes + 1;
                        annoSiguiente = anno;
                    }
                } else {
                    diaSiguiente = dia + 1;
                    mesSiguiente = mes;
                    annoSiguiente = anno;
                }
                Utils.establecerColorVerde();
                System.out.printf("Siguiente fecha es %02d/%02d/%4d\n",diaSiguiente, mesSiguiente, annoSiguiente);
                Utils.reiniciarColores();
            } else {
                //dia incorrecto
                Utils.establecerColorRojo();
                System.out.println("No se puede determinar la fecha, debido a que el día es incorrecto");
                Utils.reiniciarColores();
            }

        } else {
            // mes incorrecto
            Utils.establecerColorRojo();
            System.out.println("No se puede determinar la fecha, debido a que el mes es incorrecto");
            Utils.reiniciarColores();
        }
    }
    
}
