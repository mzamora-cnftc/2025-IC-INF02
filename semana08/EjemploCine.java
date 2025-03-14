import generico.Utils;

public class EjemploCine {

    public static void main(String[] args) {
        int capacidad, precioBoleto, edad, disponible, boletos, cantidadBoletosVendidos = 0;
        boolean esEstudiante, hayClientes;
        double descuento, totalVentaBoletos=0;

        capacidad = Utils.leerEntero("Digite la cantidad de personas en el cine: ");
        precioBoleto = Utils.leerEntero("Digite el costo del boleto: ");

        disponible = capacidad;

        hayClientes = Utils.leerBoolean("Hay clientes");

        while (hayClientes && disponible > 0 ) {
            Utils.limpiarConsola();
            System.out.println("Welcome");
            do {
                boletos = Utils.leerEntero("Digite la cantidad de boletos entre 1 y "+disponible+": ");
            } while (!(boletos >= 1 && boletos <= disponible));
            edad = Utils.leerEntero("Digite su edad: ");
            if (edad < 18) {
                esEstudiante = Utils.leerBoolean("Es estudiante");
            } else {
                esEstudiante = false;
            }

            if (edad < 18 && esEstudiante) {
                descuento = 0.10;
            } else if (edad >= 60) {
                descuento = 0.20;
            } else {
                descuento = 0;
            }

            cantidadBoletosVendidos = cantidadBoletosVendidos + boletos;
            disponible = capacidad - cantidadBoletosVendidos;
            totalVentaBoletos = totalVentaBoletos + (boletos* precioBoleto * (1-descuento));

            hayClientes = Utils.leerBoolean("Hay clientes");

        }

        //fuera del ciclo principal
       System.out.println("Cantidad de boletos vendidos: " + cantidadBoletosVendidos); 
       System.out.println("Monto total de boletos vendidos: "+totalVentaBoletos);

    }
}