/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio14;

import java.util.Scanner;
public class C4Ejercicio14 {

    
    public static void main(String[] args) {
        
        double ventas1,ventas2,ventas3,salario,porcentaje,total,salario1,salario2,salario3;
        
        System.out.println("Ventas departamento 1: ");
        Scanner entrada = new Scanner(System.in);
        ventas1 = entrada.nextDouble();
        
        System.out.println("Ventas departamento 2: ");
        Scanner entrada1 = new Scanner(System.in);
        ventas2 = entrada1.nextDouble();
        
        System.out.println("Ventas departamento 3: ");
        Scanner entrada2 = new Scanner(System.in);
        ventas3 = entrada2.nextDouble();
        
        System.out.println("Salario de los vendedores: ");
        Scanner entrada3 = new Scanner(System.in);
        salario = entrada3.nextDouble();
        
        total = ventas1 + ventas2+ ventas3;
        porcentaje = total* 0.33;
        
        if (ventas1>porcentaje) {
            salario1 = salario +0.2*salario;
            
        }
        else{
            salario1 = salario;
        }
        
        if (ventas2>porcentaje) {
            salario2 = salario +0.2*salario;
            
        }
        else{
            salario2 = salario;
        }
        
        if (ventas3>porcentaje) {
            salario3 = salario +0.2*salario;
            
        }
        else{
            salario3 = salario;
        }
        
        System.out.println("Salario departamento 1 :" +salario1);
        System.out.println("Salario departamento 2 :" +salario2);
        System.out.println("Salario departamento 3 :" +salario3);
        
        
        
    }
    
}
