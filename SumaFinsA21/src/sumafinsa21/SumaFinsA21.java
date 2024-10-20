/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumafinsa21;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SumaFinsA21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int suma = 0;
        
        // Bucle fins que la suma passi de 21
        while (suma <= 21) {
            // Demanar a l'usuari un n�mero
            System.out.print("Entra n�mero: ");
            int numero = teclat.nextInt();

            // Comprovar si el n�mero est� entre 1 i 5
            if (numero >= 1 && numero <= 5) {
                suma += numero;  // Sumar el n�mero a la suma total
            } else {
                System.out.println("El n�mero no �s correcte!");  // Missatge d'error si el n�mero no �s v�lid
            }

            // Si la suma passa de 21, mostrar el missatge final
            if (suma > 21) {
                System.out.println("M�s de 21! La suma dels n�meros entrats �s " + suma);
            }
        }
         
       
    }
    
}
