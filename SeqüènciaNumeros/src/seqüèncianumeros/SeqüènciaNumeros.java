/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seq��ncianumeros;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Seq��nciaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        // Demanar al usuari quin ha de ser el final de la seq��ncia
        System.out.print("Quin ha de ser el final de la seq��ncia? ");
        int finalSeq = teclat.nextInt();

        // Inicialitzar el primer n�mero de la seq��ncia
        int numero = 2;

        // Mostrar la seq��ncia
        System.out.print("La seq��ncia �s: ");
        
        // Utilitzar un bucle while per generar la seq��ncia
        while (numero <= finalSeq) {
            System.out.print(numero);
            // Incrementar el n�mero en 3
            numero += 3;
            // Si el n�mero encara no ha arribat al final, afegir una coma
            if (numero <= finalSeq) {
                System.out.print(", ");
            }
        }
    }
    
}
