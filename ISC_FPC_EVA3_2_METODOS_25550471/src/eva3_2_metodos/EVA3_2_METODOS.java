/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA3_2_METODOS {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String mensaje;
        int valor;
        System.out.println("Captura mensaje: ");
        mensaje = captu.nextLine();
        System.out.println("Captura repeticiones: ");
        valor = captu.nextInt();
        imprimirMensaje(mensaje,valor);//invocamos el método
    }
                      //imprimir mensaje(String,int)
    public static void imprimirMensaje(String mensaje,int repeticiones) {
        for(int i = 0; i< repeticiones; i ++){
            System.out.println(mensaje);
            
        
        }
    }
}
