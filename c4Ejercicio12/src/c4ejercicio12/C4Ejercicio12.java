/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4ejercicio12;

/**
 *
 * @author d0ubt
 */
import java.util.Scanner;
public class C4Ejercicio12 {

    public static void main(String[] args) {
        
        String nombre;
        double horas,valorhora,salario = 0;
        
        System.out.println("Nombre del trabajador: ");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
        
        System.out.println("Numero de horas trabajadas: ");
        Scanner entrada1 = new Scanner(System.in);
        horas = entrada1.nextDouble();
        
        System.out.println("Valor hora de trabajo: ");
        Scanner entrada2 = new Scanner(System.in);
        valorhora = entrada2.nextDouble();
       
        if (horas>40) {
            if (horas>48){
                salario = valorhora*40 + valorhora*8*2 + valorhora*3*(horas - 48);
            }
            else{
                salario = valorhora*40 + valorhora*2*(horas-40);
            }
        
        }
        else{
            salario = valorhora*horas;
        }
        
        System.out.println("El trabajador "+nombre+"devengo: "+salario);
    }
    
}
