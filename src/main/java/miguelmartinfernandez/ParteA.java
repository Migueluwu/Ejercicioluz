/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelmartinfernandez;

import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int W_KW = 1000;//declaracion e inicializacion de constante
        int opcion;//declaraciones de variable
        double consumoVatios, tiempo, precio, consumoTotal, consumoEuros;
        Scanner entradaTeclado = new Scanner(System.in);
        do {//Bucle para que se repita hasta que se pulse 0
            System.out.println("pulsa 0 para dinalizar el programa, para continuar pulsa cualquier otra tecla");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {//Si opcion es disitinto de 0 el programa se ejecuta de forma normal,si es 0 se acaba
                case 0:
                    System.out.println("has pulsado 0, el programa se va a finalizar");
                    break;
                default:
                    System.out.println("Introduce el consumo en vatios:");
                    consumoVatios = entradaTeclado.nextDouble();
                    System.out.println("Introduce el tiempo que ha estado en funcionanmiento en horas:");
                    tiempo = entradaTeclado.nextDouble();
                    do {//si el dato introducido no es valido se repite
                        System.out.println("introduce cual es el precio de la luz en Kw/h:");
                        precio = entradaTeclado.nextDouble();
                    } while (precio <= 0.1 || precio >= 0.45);
                    consumoTotal = (consumoVatios / W_KW) * tiempo;
                    System.out.printf("El consumo electrico total en kW es de  %.2f \n", consumoTotal);
                    consumoEuros = consumoTotal * precio;
                    System.out.printf("El consumo en euros es de %.2f \n" , consumoEuros);
                    break;
            }
        } while (opcion != 0);
    }

}
