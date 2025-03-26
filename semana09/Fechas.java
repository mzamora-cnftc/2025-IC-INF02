package semana09;

import generico.Utils;

public class Fechas {

    public static boolean validarFecha(int dia, int mes, int anno) {
        boolean salida = true;

        int ultimoDia;

        if (mes >= 1 && mes <= 12) {


            if (mes ==  2) {
                ultimoDia = 28;
            } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                ultimoDia = 31;
            } else {
                ultimoDia = 30;
            }

            if (dia >= 1 && dia <= ultimoDia) {
                salida = true;
            } else {
                salida = false;
            }

            
        } else {
            salida = false;
        }

        return salida;
    }

    public static void main(String[] args) {

        int d,m,a;
        boolean deseaContinuar, fechaValida;

        do {
            d = Utils.leerEntero("día: ");
            m = Utils.leerEntero("mes: ");
            a = Utils.leerEntero("año: ");

            fechaValida = validarFecha(d, m, a);

            if (fechaValida) {
                System.out.println("OK");
            } else {
                System.out.println("BAD");
            }

            deseaContinuar = Utils.leerBoolean("Desea continuar");

            
        } while (deseaContinuar);
        
    }
}
