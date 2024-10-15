/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amp.n�meroxifresd.unenter;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class AMPN�meroXifresDUnEnter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);
        
        // Demanar un n�mero enter positiu
        System.out.print("Introdueix un n�mero enter positiu: ");
        int numero = teclat.nextInt();

        // Comprovaci� si el n�mero �s positiu
        if (numero <= 0) {
            System.out.println("Si us plau, introdueix un n�mero positiu.");
        } else {
            int contador = 0; // Inicialitzar el comptador de xifres

            // Comptar el nombre de xifres
            while (numero > 0) {
                numero /= 10; // Dividir entre 10
                contador++; // Incrementar el comptador
            }

            // Mostrar el nombre de xifres
            System.out.println("El n�mero t� " + contador + " xifres.");
        }
    }
    
}
