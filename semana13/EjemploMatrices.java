package semana13;

import generico.Utils;

public class EjemploMatrices {




    public static void main(String[] args) {
        int[] numeros = new int[] {5,4,6,4,6,4,7,17,19};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[][] raros = new int[4][2];

        // for (int i = 0; i < raros.length; i++) {
        //     for (int j = 0; j < raros[i].length; j++) {
        //         raros[i][j] = Utils.leerEntero(String.format("i:%d-j:%d : ",i, j));
        //     }
        // }

        for (int i = 0; i < raros.length; i++) {
            for (int j = 0; j < raros[i].length; j++) {
                System.out.print(String.format("%4d ", raros[i][j]));
            }
            System.out.println();
        }

    }
}
