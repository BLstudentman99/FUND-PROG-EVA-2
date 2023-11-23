/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author g61
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuario;
        String contraseña;

        do {
            System.out.print("Ingrese el nombre de usuario: ");
            usuario = input.nextLine();

            System.out.print("Ingrese la contraseña: ");
            contraseña = input.nextLine();

            if (usuario.equals("admin") && contraseña.equals("admin")) {
                System.out.println("Acceso concedido");
                break;
            } else {
                System.out.println("Acceso denegado. Inténtelo de nuevo.");
            }
        } while (true);

        input.close();
    }
}
 
    

