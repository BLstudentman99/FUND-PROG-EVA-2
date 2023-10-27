/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //solicitar la cantidad de califas a capturar
      int cantCali;
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce el numero de calificaciones a capturar");
      cantCali = input.nextInt();
      int sumaCalifas = 0;
      
      //ACUMULADOR
      
      
      
      for (int i = 0; i < cantCali; i++) {
         System.out.println("introduce la calificación");
         int califa = input.nextInt();
         //Acumulador
         sumaCalifas = sumaCalifas + califa;
         //sumaCalifas+=califa; 
      }
      System.out.println("La sumatoria = " + sumaCalifas);
      //si el divisor es entero, el resultado es entero
      double promedio = sumaCalifas / (cantCali * 1.0);
      System.out.println("el promedio de calificaciónes es = " + promedio);
   }

   
}
