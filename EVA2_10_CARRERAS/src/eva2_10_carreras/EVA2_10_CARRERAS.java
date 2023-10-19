/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String carrera;
      Scanner input = new Scanner(System.in);
      System.out.println("introduce las iniciales de la carrera en letra mayuscula");
      carrera = input.nextLine();
      
      switch(carrera){
         case "ISC":
            System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
            break;
         case "INF":
            System.out.println("INFORMATICA");
            break;
         case "LA":
            System.out.println("LICENCIATURA DE ADMINISTRACION");
            break;
         case "ARQ":
            System.out.println("ARQUITECTURA");
            break;
         case "IND":
            System.out.println("INGENIERIA INDUSTRIAL");
            break;
         case "IDI":
            System.out.println("INGENIERIA EN DISEÑO INDUSTRIAL");
            break;
         case "IGE:":
            System.out.println("INGENIERIA EN GESTION EMPRESARIAL");
            break;
         default:
            System.out.println("LAS INICIALES " + carrera + " NO SON VALIDAS");
                 
         
      }
              
   }
   
}
