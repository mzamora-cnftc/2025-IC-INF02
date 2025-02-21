package semana05;

import generico.Utils;

public class EjemploChar {
    public static void main(String[] args) {
        char letra = Utils.leerCaracter("Digite una letra: ");

        // Wrapper
        // char --> Character
        // double --> Double
        // int --> Integer
        // boolean --> Boolean

        System.out.println("Versión original: " + letra);
        System.out.println("Versión mayúscula: " + Character.toUpperCase(letra));

        

        if (Character.toUpperCase(letra) == 'M') {
            System.out.println("La letra es m");
        } else {
            System.out.println("La letra NO es m");
        }

        System.out.print("hola\n\n");
        System.out.print("\tmundo\n");

        char l = 'A';
        System.out.println(l);
        System.out.println((int) l);
        System.out.println((char) (l+1));

    }
}
