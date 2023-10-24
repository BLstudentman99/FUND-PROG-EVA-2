/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int cali; 
      Scanner input = new Scanner(System.in);
      System.out.println("Escriba su calificación");
      cali = input.nextInt();
      if ((cali >= 0) && (cali <=100)){
         System.out.println("Tu calificación " + cali + " Es valida" );
         if(cali < 60)
            System.out.println("tu puntuación es F!!");
         if ((cali >= 60) && (cali <=69))
            System.out.println("tu puntuación es D!!");
         if ((cali >= 70) && (cali <=79))
            System.out.println("tu puntuación es C!!");
         if ((cali >= 80) && (cali <=89))
            System.out.println("tu puntuación es B!!");
         
          
         if ((cali >= 90) && (cali <=100))
           System.out.println("tu puntuación es A!!");
      
      
      
      
      }
              
   }
   
}
