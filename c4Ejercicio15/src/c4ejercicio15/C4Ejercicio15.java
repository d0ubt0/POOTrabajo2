/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio15;

/**
 *
 * @author d0ubt
 */

import java.util.Scanner;
public class C4Ejercicio15 {

    
    public static void main(String[] args) {
        double pesoA,pesoB,pesoC,pesoD;
        
        System.out.println("Peso A: ");
        Scanner entrada = new Scanner(System.in);
        pesoA = entrada.nextDouble();
        
        System.out.println("Peso B: ");
        Scanner entrada1 = new Scanner(System.in);
        pesoB = entrada1.nextDouble();
        
        System.out.println("Peso C: ");
        Scanner entrada2 = new Scanner(System.in);
        pesoC = entrada2.nextDouble();
        
        System.out.println("Peso D: ");
        Scanner entrada3 = new Scanner(System.in);
        pesoD = entrada3.nextDouble();
        
        if ((pesoA==pesoB)&&(pesoA==pesoC)) {
            System.out.println("La esfera D es la diferente");
            if (pesoA>pesoD) {
                System.out.println("Y es de menor peso");
                
            }
            else{
                System.out.println("Y es de mayor peso");
            }
        }
        else if ((pesoA==pesoB)&&(pesoA==pesoD)) {
            System.out.println("La esfera C es la diferente");
            if (pesoA>pesoC) {
                System.out.println("Y es de menor peso");
                
            }
            else{
                System.out.println("Y es de mayor peso");
            }
        }
        
        else if ((pesoA==pesoC)&&(pesoA==pesoD)) {
            System.out.println("La esfera B es la diferente");
            if (pesoA>pesoB) {
                System.out.println("Y es de menor peso");
                
            }
            else{
                System.out.println("Y es de mayor peso");
            }
        }
        else{
            System.out.println("La esfera A es la diferente");
            if (pesoB>pesoA) {
                System.out.println("Y es de menor peso");
                
            }
            else{
                System.out.println("Y es de mayor peso");
            }
        }
    }
    
}
