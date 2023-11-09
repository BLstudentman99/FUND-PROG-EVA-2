/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_31_uso_arreglos4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_31_USO_ARREGLOS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //generar un arreglo tamaño 15
        //llenarlo con valores aleatorios: 0 - 99
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
             arreglo[i] = (int) (Math.random() * 100);
        }
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print("[" + arreglo[i] + "]");
    }
         System.out.println(" ");
         System.out.println("que valor necesitas?");
         Scanner input = new Scanner(System.in);
         int valor = input.nextInt();
         int posi = -1;
         
         for (int i = 0; i < arreglo.length; i++) {
             if(valor == arreglo[i]){
                 posi = i;
                 break;
                 
    
                 
             
             
             }
         }
         if (posi != -1)
             System.out.println("el valor esta en la pisición: " + posi );
         else
             System.out.println("el valor no encontrado");
        }
}
