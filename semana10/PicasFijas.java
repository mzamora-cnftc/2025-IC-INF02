package semana10;

import generico.Utils;

public class PicasFijas {


    public static boolean esUnNumeroValido(int numero) {
        boolean esValido = true;

        int u, d, c, m;

        u = numero % 10;

        numero = numero / 10;

        d = numero % 10;

        numero = numero / 10;

        c = numero % 10;

        m = numero / 10;

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
        System.out.println(esUnNumeroValido(1492));
        System.out.println(esUnNumeroValido(2025));
        System.out.println(esUnNumeroValido(1987));
        System.out.println(esUnNumeroValido(1991));

        for (int i = 0; i < 10; i++) {
            System.out.println(generarNumeroValidoAleatorio());
        }
    }
}
