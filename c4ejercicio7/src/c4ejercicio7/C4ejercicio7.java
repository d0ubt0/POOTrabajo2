/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio7;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class C4ejercicio7 {

    public static void main(String[] args) {
        
        double A,B;
        System.out.println("A: ");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextDouble();
        
        System.out.println("B: ");
        Scanner entrada1 = new Scanner(System.in);
        B = entrada1.nextDouble();
        
        if (A > B) {
            System.out.println("A es mayor que B");
            
        }
        else if (A < B) {
            System.out.println("A es menor que B");
            
        }
        else {
            System.out.println("A es igual que B");
    }
    
   
}
}
