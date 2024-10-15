import java.util.Random;

/**
 *
 * @author docto
 */

public class Llan�amentMoneda {

    public static void main(String[] args) {
        Random random = new Random();
        int cares = 0;
        int creus = 0;
        int i = 0; // Inicialitzem un comptador

        // Llan�ament de la moneda 100 vegades amb un bucle while
        while (i < 100) {
            int resultat = random.nextInt(2); // 0 per cara, 1 per creu

            if (resultat == 0) {
                cares++;  // Incrementem cares si el resultat �s 0
            } else {
                creus++;  // Incrementem creus si el resultat �s 1
            }

            i++; // Incrementem el comptador
        }

        // Mostrar el resultat
        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
}