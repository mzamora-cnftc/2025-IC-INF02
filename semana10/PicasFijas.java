package semana10;

import generico.Utils;

public class PicasFijas {

    public static int obtenerPosicionNumerica(int numero, int pos) {
        return numero / (int) Math.pow(10,pos) % 10;
    }


    public static int contarPicas(int numero1, int numero2) {
        int picas = 0;

        int n1, n2;

        for (int i = 0; i < 4; i++) {
            n1 = obtenerPosicionNumerica(numero1, i);
            for (int j = 0; j < 4; j++) {
                n2 = obtenerPosicionNumerica(numero2, j);
                if (i != j) {
                    picas += n1==n2?1:0;
                }
            }
        }

        return picas;
    }

    public static int contarFijas(int numero1, int numero2) {
        int fijas = 0;

        for (int i = 0; i < 4; i++) {
            // if(obtenerPosicionNumerica(numero1, i)==obtenerPosicionNumerica(numero2, i)) {
            //     fijas++;
            // }
            fijas += (obtenerPosicionNumerica(numero1, i)==obtenerPosicionNumerica(numero2, i))?1:0;

        }

        return fijas;
    }

    public static boolean esUnNumeroValido(int numero) {
        boolean esValido = true;

        int u, d, c, m;

        u = obtenerPosicionNumerica(numero, 0);
        d = obtenerPosicionNumerica(numero, 1);
        c = obtenerPosicionNumerica(numero, 2);
        m = obtenerPosicionNumerica(numero, 3);


        //System.out.printf("m %d c %d d %d u %d ", m, c, d, u);

        esValido = u != d && u != c && u != m && d != c && d != m && c != m;

        return esValido;
    }


    public static int generarNumeroValidoAleatorio() {
        int numero;

        do {
            numero = Utils.generarNumerosEntre(1000, 9999);
        } while (!esUnNumeroValido(numero));

        return numero;
    }

    public static void main(String[] args) {
        // System.out.println(esUnNumeroValido(1492));
        // System.out.println(esUnNumeroValido(2025));
        // System.out.println(esUnNumeroValido(1987));
        // System.out.println(esUnNumeroValido(1991));

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(generarNumeroValidoAleatorio());
        // }

        System.out.println(obtenerPosicionNumerica(1896, 2));
        System.out.println(contarFijas(1274, 5174));
        System.out.println(contarPicas(1274, 5174));
    }
}
