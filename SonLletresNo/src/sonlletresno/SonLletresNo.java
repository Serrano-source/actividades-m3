/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sonlletresno;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SonLletresNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Bucle per demanar 10 car�cters
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introdueix el car�cter " + i + ": ");
            char car = teclat.next().charAt(0);  // Llegeix un sol car�cter

            // Comprova si �s una lletra maj�scula
            if (car >= 'A' && car <= 'Z') {
                System.out.println(car + " �s una lletra maj�scula.");
            }
            // Comprova si �s una lletra min�scula
            else if (car >= 'a' && car <= 'z') {
                System.out.println(car + " �s una lletra min�scula.");
            }
            // Si no �s ni maj�scula ni min�scula, no �s una lletra
            else {
                System.out.println(car + " no �s una lletra.");
            }
        }

        teclat.close();  // Tanca el Scanner
    }
    
}
