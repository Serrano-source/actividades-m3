/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endevinaelnumero;

import java.util.Random;
import java.util.Scanner;

public class EndevinaElNumero {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclat = new Scanner(System.in);
        int numeroGenerat = random.nextInt(100) + 1;
        int intent = 1;
        int numeroUsuari;
        boolean encertat = false;

        System.out.println("Endevina un n�mero que he generat compr�s entre 1 i 100");

        // Bucle mentre que no s'ha encertat i queden intents
        while (intent <= 10 && !encertat) {
            System.out.print("Entra un n�mero (intent " + intent + "): ");
            numeroUsuari = teclat.nextInt();

            if (numeroUsuari == numeroGenerat) {
                System.out.println("L'has encertat!!");
                encertat = true; // Indicar que s'ha encertat
            } else if (numeroUsuari < numeroGenerat) {
                System.out.println("El n�mero que he generat �s m�s gran que el que has pensat");
            } else {
                System.out.println("El n�mero que he generat �s m�s petit que el que has pensat");
            }

            intent++;
        }

        if (!encertat) {
            System.out.println("Ho sento, no has pogut endevinar el n�mero. Era: " + numeroGenerat);
        }
    }
}

//numero <= valorUsuari