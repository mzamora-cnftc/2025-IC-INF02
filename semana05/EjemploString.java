package semana05;

import generico.Utils;

public class EjemploString {

    public static void main(String[] args) {
        String compañera1 = "Abigail", compañera2 = "  María    Alexandra  ", compañero1 = "cristopher",
                compañero2 = "Daniel";
        String sinNada = null;

        int x = 10;
        double y = 20.3;
        char c = 'a';

        Utils.limpiarConsola();

        System.out.println(compañera1);
        System.out.println(compañera1.toUpperCase());
        System.out.println(compañera1.toLowerCase());
        System.out.println(compañera1);

        System.out.println(compañera2);
        System.out.println(compañera2.trim());
        System.out.println(compañera2);
        compañera2 = compañera2.trim();
        System.out.println(compañera2);

        // if (compañero1 == "cristopher") /NO HACER ESTO PARA COMPARAR EL VALOR
        if (compañero1.equals("Cristopher")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (compañero1.equalsIgnoreCase("Cristopher")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

        }

        if ("hola".equals(sinNada)) {
            System.out.println("Si entro :)");
        } else {
            System.out.println("No entro al null");
        }

        if (compañera1.equalsIgnoreCase(compañera2)) {
            System.out.println("Son iguales las compañeras");
        } else {
            System.out.println("No son iguales las compañeras");
        }

    }
}