package calculs;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author docto
 */
public class SuperCalculadora {
    // Sense atributs
    
    // int cuando sumas numeros naturals
     int sumaPrimersNumeros(int n) {
        int suma = 0;
         for(int i=1; i<=n; i++) {// 1,2,3,......, n
             suma = suma + i;
         }
         //System.out.println("La suma �s " + suma);
         return suma;
    }
     
    //calcularFactorial(int n): retorna el factorial de n (ex. 5! = 5 * 4 * 3 * 2 * 1).
    //sumaQuadrats(int n): retorna la suma dels quadrats dels primers n n�meros (ex. 1� + 2� + ... + n�).
     int sumaQuadrats(int n) {
         int sumaQuadrats = 0;
        return sumaQuadrats; 
     }
    //calcularPotencia(int base, int exponent): retorna el resultat de la base elevada a l'exponent. S'ha de resoldre fent sumes (ex.  2 +2 + 2 = 23 ).
    //nombreDigits(int n): retorna el nombre de d�gits de n (ex. el nombre 1234 t� 4 d�gits).
     
     //mostrarMenu() que mostri les diferents operacions disponibles per a l'usuari.
     void mostarMenu(){
         int opcio;
         System.out.print(" Men� de SuperCalculadora:");   
         System.out.println("1. Suma dels primers n n�meros");
         System.out.println("2. Factorial d'un nombre");
         System.out.println("3. Suma dels quadrats dels primres n n�meros");
         System.out.println("4. Pot�ncia d'un nombre");
         System.out.println("5. Nombre de d�gits d'un nombre");
         System.out.println("6. Sortir");
         Scanner teclat = new Scanner(System.in);
         opcio = teclat.nextInt();
         
         
         switch (opcio) {
             case 1:
                 
         }
     }
}
