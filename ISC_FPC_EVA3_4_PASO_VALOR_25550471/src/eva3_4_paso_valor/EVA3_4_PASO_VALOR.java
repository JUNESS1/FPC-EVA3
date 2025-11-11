/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_paso_valor;

/**
 *
 * @author equipo
 */
public class EVA3_4_PASO_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 5;//primitivos
        System.out.println("valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("valor (despues) = " + valor);
    }
    //le suma uno
    public static void incrementar(int val){
        val++;
        //val = val + 1;
    
    }
}
