/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int cant;
       int[] califas;//aqui el arreglo no existe 
       Scanner input = new Scanner(System.in);
        System.out.println("Cuantas calificaciones quieres capturar?");
        cant = input.nextInt();
        //ya que sabemos cuantas calificaciones necesitamos, creamos el arreglo
        califas = new int[cant];//creamos el arreglo
        for (int i = 0; i < cant; i++) {
            System.out.println("introduce la calificación");
            califas[i] = input.nextInt();
            
        }
          for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
            
    }
    
    }
}
