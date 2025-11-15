/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA3_9_AREAS {

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
        areaCirculo();
        }else if(opcion == 2){
            areaRectangulo();
            
            }else if(opcion == 3){
            areaTrapecio();
                
                }else if(opcion == 4){
                    
                }
        }while(opcion != 4);
            
        }

    public static void imprimirMenu() {
        
        System.out.println("**********************BIENVENIDO AL SISTEMA FÓRMULAS DE ÁREA*****************************");
        System.out.println("Selecciona una opcion");
        System.out.println("1.Calcular área de un círculo");
        System.out.println("2.Calcular área de un rectángulo");
        System.out.println("3.Calcular área de un trapecio");
        System.out.println("4.Salir del sistema");
    }
    public static void areaCirculo() {
        Scanner captu = new Scanner(System.in);
        int radio; 
        double area;
        System.out.println("*****************CALCULO DEL ÁREA DE UN CIRCULO***************");
        System.out.println("Captura el radio: ");
        radio = captu.nextInt();

        long radioCuadrado = potenciaCirc(radio, 2);
        area = 3.1416 * radioCuadrado;

        System.out.println("Área = pi * r^2 = " + area);

    }
    
    public static long potenciaCirc(int b, int exp) {
        int resu = 1;
        for (int i = 0; i < exp; i++) {
            resu *= b;
        }
        return resu;
        
    }
    public static void areaRectangulo() {
        Scanner captu = new Scanner(System.in);
        int base, altura;
        System.out.println("*****************CALCULO DEL ÁREA DE UN RECTÁNGULO***************");
        System.out.println("Captura la base: ");
        base = captu.nextInt();
        System.out.println("Captura la altura: ");
        altura = captu.nextInt();
        
        int area = formulaRect(base, altura);
        System.out.println("Área = base * altura = " + area);
    
    }
    public static int formulaRect(int b, int h){
       int resu = 0;
        for (int i = 0; i < b; i++) {
            resu += h;
        }
        return resu;

     }
    public static void areaTrapecio() {
        Scanner captu = new Scanner(System.in);
        int bMayor, bMenor, altura;
        double area;
        System.out.println("*****************CALCULO DE LA SUMA***************");
        System.out.print("Captura la base mayor: ");
        bMayor = captu.nextInt();
        System.out.print("Captura la base menor: ");
        bMenor = captu.nextInt();
        System.out.print("Captura la altura: ");
        altura = captu.nextInt();

        int sumaBases = bMayor + bMenor;
        int producto = formulaTrap(sumaBases, altura);
        area = producto / 2.0;
        
        System.out.println("Área = ((B + b) * h) / 2 = " + area);


    }
    public static int formulaTrap(int a, int b){
       int resu = 0;
    for (int i = 0; i < b; i++) {
        resu += a;
    }
    return resu;

     }
}
