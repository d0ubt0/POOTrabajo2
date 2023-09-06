/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio13;

/**
 *
 * @author d0ubt
 */

import java.util.Scanner;
public class C4Ejercicio13 {

    
    public static void main(String[] args) {
        double valor,pagar;
        String color;
        int descuento;
        
        System.out.println("Valor de la compra: ");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextDouble();
        
        System.out.println("Color de la bola en mayuscula: ");
        Scanner entrada1 = new Scanner(System.in);
        color = entrada1.nextLine();
        
        if (color.equals("BLANCO")) {
            pagar = valor;
            
        }
        else if (color.equals("VERDE")) {
            pagar = valor*0.9;
        }
        else if (color.equals("AMARILLO")) {
            pagar = valor*0.75;
        }
        else if (color.equals("AZUL")) {
            pagar = valor*0.5;
        }
        else{
            pagar = 0;
        }
        
        
        System.out.println("El cliente debe pagar "+pagar);
        System.out.println(color+".");
        
    }
    
}
