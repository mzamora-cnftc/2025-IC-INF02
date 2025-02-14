package semana04;

import generico.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;


        Utils.limpiarConsola();
        ladoA = Utils.leerDoble("Digite el lado A: ");
        ladoB = Utils.leerDoble("Digite el lado B: ");
        ladoC = Utils.leerDoble("Digite el lado C: ");

        if ((ladoA + ladoB > ladoC)&&(ladoA + ladoC > ladoB)&&(ladoB + ladoC > ladoA)) {
            System.out.println("Este es un triangulo");
        } else {
            System.out.println("Este NO es un triangulo");
        }
    }

}