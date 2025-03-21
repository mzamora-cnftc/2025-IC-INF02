package semana09;

public class EjemploString {


    /**
     * Esta rutina toma un texto y lo repite la cantida de veces
     * @param texto Es el texto que queremos repetir
     * @param cantidad La cantidad de veces a repetir
     * @return El texto procesado
     */
    public static String repetirString(String texto, int cantidad) {
        String salida = "";

        for (int i = 0; i < cantidad; i++) {
            salida = salida + texto;
        }

        return salida;
    }

    public static void main(String[] args) {
        String nombre = "  ExMaría Alexandra    ";
        String otraCosa = ":) ";
        int largo;

        System.out.println(nombre.toUpperCase().repeat(4));
        System.out.println(otraCosa.repeat(15));
        largo = nombre.trim().length();
        System.out.println(largo);

        System.out.println("Prueba");
        System.out.println(repetirString("LDA ", 10));
    }
}
