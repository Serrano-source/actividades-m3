/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicapetitidivideixgranfinsrevertir;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MultiplicaPetitIDivideixGranFinsRevertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        // Demanar els n�meros a l'usuari
        System.out.print("Introdueix un n�mero gran: ");
        int gran = teclat.nextInt();
        
        System.out.print("Introdueix un n�mero petit: ");
        int petit = teclat.nextInt();

        // Comprovar que gran �s efectivament m�s gran que petit
        if (gran <= petit) {
            System.out.println("El n�mero gran ha de ser m�s gran que el n�mero petit.");
        } else {
            // Bucle while per imprimir els valors fins que gran sigui menor o igual que petit
            while (gran > petit) {
                System.out.println("Gran = " + gran + "  Petit = " + petit);
                gran /= 2; // Dividir el n�mero gran per 2
                petit *= 2; // Multiplicar el n�mero petit per 2
            }
        }
    }
    
}
