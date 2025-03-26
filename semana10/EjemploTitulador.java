package semana10;

import generico.Utils;

public class EjemploTitulador {


    public static String repetidor(String textoParaRepetir, int cantidadParaRepetir) {
        String salida = "";
        for (int i = 0; i < cantidadParaRepetir; i++) {
            salida = salida + textoParaRepetir;
        }
        return salida;
    }

    public static void imprimirTitulo(String titulo, int largo) {
        String linea = repetidor("*", largo);
        int disponible = largo - 2;
        int espaciosEnBlancoTotales = disponible - titulo.length();
        int espacioBloque1, espacioBloque2;
        espacioBloque1 = espaciosEnBlancoTotales / 2;
        espacioBloque2 = espaciosEnBlancoTotales - espacioBloque1;
        System.out.println(linea);
        System.out.println("*"+ repetidor(" ", espacioBloque1) + titulo + repetidor(" ", espacioBloque2) +"*");
        System.out.println(linea);
    }

    public static void main(String[] args) {
        Utils.limpiarConsola();
        String contendor = "";
        contendor = repetidor("*", 6);

        System.out.println(contendor);


        imprimirTitulo("Alex & María", 40);
        imprimirTitulo("SEMANA 10, YA CASI SALIMOS", 40);
        imprimirTitulo("SEMANA 10, YA CASI SALIMOS", 66);
    }
}
