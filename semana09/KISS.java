package semana09;

public class KISS {

    public static double calcularFactorPizza(double pulgadas, double precio) {
        double area = calcularAreaCirculo(pulgadas);
        double salida = precio / area;

        return salida;

    }

    public static double calcularAreaCirculo(double radio) {
        double area = 0;

        area = Math.pow(radio, 2) * Math.PI;

        return area;
    }

    public static double devolverEnElTiempo(double dinero, double inflacion, int años) {
        double dineroPasado = 0;

        double factor;

        factor = 1 + (inflacion / 100);

        dineroPasado = dinero / Math.pow(factor, años);

        return dineroPasado;
    }

    public static int sumar(int a, int b) {
        int resultado;

        resultado = a + b;

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("PJ");
        System.out.printf("La pizza %2d cuesta %7d tiene un factor de %4.2f\n",12,4990, calcularFactorPizza(12, 4990));
        System.out.printf("La pizza %2d cuesta %7d tiene un factor de %4.2f\n",14,6990, calcularFactorPizza(14, 6990));
        System.out.printf("La pizza %2d cuesta %7d tiene un factor de %4.2f\n",16,10990, calcularFactorPizza(16, 10990));
        System.out.println("PH");
        System.out.printf("La pizza %2d cuesta %7d tiene un factor de %4.2f\n",12,5950, calcularFactorPizza(12, 5950));
        System.out.printf("La pizza %2d cuesta %7d tiene un factor de %4.2f\n",14,8500, calcularFactorPizza(14, 8500));        
    }
}
