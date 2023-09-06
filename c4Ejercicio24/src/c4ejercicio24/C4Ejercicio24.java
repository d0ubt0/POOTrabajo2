/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio24;

/**
 *
 * @author d0ubt
 */

import java.util.Scanner;
public class C4Ejercicio24 {

    
    public static void main(String[] args) {
        
        double A,B,C;
        
        System.out.println("A: ");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextDouble();
        
        System.out.println("B: ");
        Scanner entrada1 = new Scanner(System.in);
        B = entrada1.nextDouble();
        
        System.out.println("C: ");
        Scanner entrada2 = new Scanner(System.in);
        C = entrada2.nextDouble();
        
        if (A>B) {
            if (A>C) {
                System.out.println("La esfera A es la de mayor peso");
            }
            else{
                System.out.println("La esfera C es la de mayor peso");
            }
            
        }
        else{
            if (B>C) {
                System.out.println("La esfera B es la de mayor peso");
            }
            else{
                System.out.println("La esfera C es la de mayor peso");
            }
        }
    }
    
}
