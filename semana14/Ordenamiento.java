package semana14;

import java.util.Arrays;


public class Ordenamiento {
    
    static int buscarLineal(int[] datos, int valorParaBuscar) {
        int index = 0;

        for (int i = 0; i < datos.length; i++) {
            if (valorParaBuscar == datos[i]) {
                index = i;
                break;
            }
        }

        return index;
    }

    static void cargar(int[] enteros, int factor) {
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) ( Math.random() * factor);
        }
    }

    public static void main(String[] args) {
        int posicion;
        long inicio, fin;

        System.out.println("Creación del arreglo");
        int[] datos = new int[1000000];
        // System.out.println(  Arrays.toString(datos) );
        System.out.println();

        

        System.out.println("Carga de datos aleatorios");
        cargar(datos, 1000000);
        // System.out.println(  Arrays.toString(datos) );
        System.out.println();


        System.out.println("Ordenamos datos");
        inicio = System.nanoTime();
        Arrays.sort(datos);
        fin = System.nanoTime();
        // System.out.println(  Arrays.toString(datos) );        
        System.out.println("t: " + (fin-inicio));
        System.out.println();


        System.out.println("Valor a buscar es:");
        int valor = datos[ (int) (Math.random() * datos.length) ];
        System.out.println(valor);
        System.out.println();

        
        System.out.println("Probando búsqueda lineal");
        inicio = System.nanoTime();
        posicion = buscarLineal(datos, valor);
        fin = System.nanoTime();
        System.out.println("Encontrado en: "+posicion);
        System.out.println("t: " + (fin-inicio));


        System.out.println("Probando búsqueda binaria");
        inicio = System.nanoTime();
        posicion = Arrays.binarySearch(datos, valor);
        fin = System.nanoTime();
        System.out.println("Encontrado en: "+posicion);
        System.out.println("t: " + (fin-inicio));
    }

}