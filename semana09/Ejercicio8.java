package semana09;

public class Ejercicio8 {

    public static boolean analizarPalindrome(String palabra) {
        boolean esPalindrome = true;
        char primero, ultimo;
        int limite, n;

        n = palabra.length();
        limite = n / 2;

        for (int i = 0; i < limite; i++) {
            primero = palabra.charAt(i);
            ultimo = palabra.charAt(n-1-i);
            if (primero != ultimo) {
                esPalindrome = false;
            }
/*             System.out.println(primero + "-" + ultimo);
            System.out.println(i); */
        }

        return esPalindrome;
    }



    public static void main(String[] args) {
        System.out.println(analizarPalindrome("sales"));
    }
}
