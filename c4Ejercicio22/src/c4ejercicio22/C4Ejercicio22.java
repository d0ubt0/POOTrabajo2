/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio22;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class C4Ejercicio22 {

    
    public static void main(String[] args) {
            
        String nombre;
        double horas,salario,salariomes;
        
        System.out.println("Nombre empleado: ");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
        
        System.out.println("Salario basico por hora: ");
        Scanner entrada1 = new Scanner(System.in);
        salario = entrada1.nextDouble();
        
        System.out.println("Horas trabajadas: ");
        Scanner entrada2 = new Scanner(System.in);
        horas = entrada2.nextDouble();
        
        salariomes = horas* salario;
        
        if (salariomes>450000) {
            System.out.println("Nombre:" + nombre);
            System.out.println("Salario mensual:" + salariomes);
            
        }
        else{
            System.out.println("Nombre:" + nombre);
        }
        
        
    }
    
}
