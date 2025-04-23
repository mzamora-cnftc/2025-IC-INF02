package semana14;

public class Reto {

    public static String algunaFuncion() {
        String contenido = "Hola, Mundo\n";

        contenido = contenido + String.format("%10d colones interes %12.2f\n",1000,555.25);
        contenido = contenido + String.format("%10d colones interes %12.2f\n",3000,123.25);
        contenido = contenido + String.format("%10d colones interes %12.2f\n",5000,250.25);

        return contenido;
    }

    public static void main(String[] args) {



        generico.Utils.escribirArchivo("semana14.txt", algunaFuncion());

        System.out.println(algunaFuncion());
    }
}