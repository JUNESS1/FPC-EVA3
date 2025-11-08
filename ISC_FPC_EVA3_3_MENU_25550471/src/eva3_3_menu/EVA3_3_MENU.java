/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = captu.nextInt();
        if (opcion == 1){
        calcularPotencia();
        }else if(opcion == 2){
            sumaNumeros();
                
                }else if(opcion == 3){
                    
                }
        }while(opcion != 3);
            
        }

    public static void imprimirMenu() {
        
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selecciona una opcion");
        System.out.println("1.Calcular una potencia");
        System.out.println("2.Sumar dos numeros");
        System.out.println("3.Salir del sistema");
        System.out.println("Seleciona una opcion");
    }
    public static void calcularPotencia() {
        Scanner captu = new Scanner(System.in);
        int base;
        long exp;
        System.out.println("*****************CALCULO DE UNA POTENCIA***************");
        System.out.println("Captura la base: ");
        base = captu.nextInt();
        System.out.println("Captura el exponente: ");
        exp = captu.nextLong();
        
        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
    }
    
    public static long calcularPot(int base, long expo) {
        long resu = 1;
        for(long i = 1; i <= expo; i++){
            resu = resu * base;
        }
        return resu;
    
    }
    public static void sumaNumeros() {
        Scanner captu = new Scanner(System.in);
        int num1, num2;
        System.out.println("*****************CALCULO DE LA SUMA***************");
        System.out.println("Captura el primer numero: ");
        num1 = captu.nextInt();
        System.out.println("Captura el segundo numero: ");
        num2 = captu.nextInt();
        
        int resultado = calcularSuma(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }
    public static int calcularSuma(int a, int b){
        int suma = 0;
    for (int i = 0; i < 2; i++) {
        if (i == 0) suma += a;
        else suma += b;
    }
        return suma;
    }
        
    
}
