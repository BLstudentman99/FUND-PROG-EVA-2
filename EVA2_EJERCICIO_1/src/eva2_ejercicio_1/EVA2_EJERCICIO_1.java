/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        int valor2;
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();
        System.out.println("inserte el primer numero");
        valor2 = input.nextInt();
        System.out.println("inserte el segundo numero");
        System.out.println("los numeros entre  los valores son :");
        for (int i = valor; i <= valor2; i++) {
            System.out.println(i);
            
        }
           
    }
    
}
