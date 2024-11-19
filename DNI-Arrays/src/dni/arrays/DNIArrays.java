/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dni.arrays;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DNIArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Array de lletres corresponents al DNI
        char[] lletres = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada del n�mero de DNI sense lletra
            System.out.println("Introdueix el n�mero del DNI (sense lletra): ");
            int numeroDNI = scanner.nextInt();

            // C�lcul del residu de la divisi� entre 23
            int residu = numeroDNI % 23;

            // Agafem la lletra corresponent de l'array
            char lletraDNI = lletres[residu];

            // Mostrem el resultat
            System.out.println("DNI: " + numeroDNI);
            System.out.println("El residu de dividir-lo entre 23 �s: " + residu);
            System.out.println("La lletra seria la " + lletraDNI + ", que �s la que ocupa aquesta posici� l'array de lletres");
        } catch (Exception e) {
            System.out.println("Error: Assegura't d'introduir un n�mero enter v�lid.");
        } finally {
            scanner.close(); // Tanquem el Scanner per alliberar recursos
        }
    }
    
}
