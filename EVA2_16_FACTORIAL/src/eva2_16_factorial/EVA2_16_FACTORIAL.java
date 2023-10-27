/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int num;
      Scanner input = new Scanner(System.in);
      System.out.println("introduce el número:");
      num = input.nextInt();
      //vamos a calcular el factorial
      //1. PRIMERO HAY QUE TENER UN CICLO QUE GENERE LOS NÚMEROS
      //QUE INTERVIENEN EN EL FACTORIAL --> 3 -> 3, 2, 1
      int factorial = 1;
              
      for (int i = num; i >= 1; i--) {
         System.out.print(i + " X ");
         factorial = factorial * i;

      }
      System.out.println("factorial de " + num + " es = " + factorial);
   }
   
}
