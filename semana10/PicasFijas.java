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


    public static void jugar() {
        int numero, numeroSecreto, intentos=0;
        numeroSecreto = generarNumeroValidoAleatorio();
        do {
            intentos++;
            System.out.println("Intento: "+intentos);
            numero = Utils.leerEntero("Digite el número: ");
            if(numero == numeroSecreto) {
                System.out.println("Felicidades ha ganado");
            } else {
                System.out.println("Picas: " + contarPicas(numero, numeroSecreto));
                System.out.println("Fijas: " + contarFijas(numero, numeroSecreto));
            }

        } while (numero != numeroSecreto && intentos < 5);
        System.out.println("Número secreto: " + numeroSecreto);
    }

    public static void main(String[] args) {
        Utils.limpiarConsola();
        jugar();
        System.out.println("Hasta la vista, baby!");

    }
}
