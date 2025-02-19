import generico.Utils;



public class Test {

    public static void main(String[] args) {
        Utils.limpiarConsola();
        System.out.println("Hola, Mundo");
        Utils.establecerColorAzul();
        System.out.println("Hola, Mundo");
        Utils.establecerColorAmarillo();
        System.out.println("Hola, Mundo");
        Utils.establecerColorBlanco();
        System.out.println("Hola, Mundo");
        Utils.establecerColorCian();
        System.out.println("Hola, Mundo");
        Utils.establecerColorMangenta();
        System.out.println("Hola, Mundo");
        Utils.establecerColorRojo();
        System.out.println("Hola, Mundo");
        Utils.establecerColorVerde();
        System.out.println("Hola, Mundo");
        Utils.establecerColorAzul();
        System.out.print("Hola ");
        Utils.establecerColorMangenta();
        System.out.println("Mundo!");

        Utils.pausar();
        Utils.reiniciarColores();
        Utils.limpiarConsola();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorAzul();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorAmarillo();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorBlanco();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorCian();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorMangenta();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorRojo();
        System.out.println("Hola, Mundo");
        Utils.establecerFondoColorVerde();
        System.out.println("Hola, Mundo");
        Utils.pausar();
        Utils.reiniciarColores();  
        char x = Utils.leerCaracter("Digite un caracter: ");
        System.out.println(x);
    }
}