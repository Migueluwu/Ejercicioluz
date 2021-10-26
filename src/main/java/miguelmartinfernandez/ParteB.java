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
public class ParteB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int W_KW = 1000;//declaracion e incializacion de constante
        int opcion;//declaraciones de variables
        double consumoVatios, tiempoPunta, tiempoLlana, horaValle, horaPunta,
                consumoLlana, consumoValle, consumoTotal, precioPunto, preciollana, preciovalle;
        Scanner entradaTeclado = new Scanner(System.in);
        do {//Bucle hasta que opcion sea distinto de 0
            System.out.println("pulsa 0 para finalizar el programa, si desea continuar pulse cualquier otro numero ");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {// Si opcion es distinto de 0 el programa se ejecuta de forma normal, si es 0 finaliza
                case 0:
                    System.out.println("has pulsado cerrar programa");
                    break;
                default:

                    System.out.println("Introduce el consumo en vatios del aparato:");
                    consumoVatios = entradaTeclado.nextDouble();
                    do {//se repite si has introducido mal los datos
                        System.out.println("Introduce cuanto vale en kWh en hora punta:");
                        precioPunto = entradaTeclado.nextDouble();
                    } while (precioPunto <= 0.1 || precioPunto >= 0.45);
                    do {//se repite si has introducido mal los datos o si el precio de hora llana es mayor que hora punta
                        System.out.println("Introduce cuanto vale en kWh en hora llana:");
                        preciollana = entradaTeclado.nextDouble();
                    } while ((preciollana <= 0.1 || preciollana >= 0.45) || preciollana > precioPunto);
                    do {//se repite si has introducido mal los datos o si el precio de hora llana es mayor que hora llana
                        System.out.println("Introduce cuanto vale en kWh en hora valle:");
                        preciovalle = entradaTeclado.nextDouble();
                    } while ((preciovalle <= 0.1 || preciovalle >= 0.45) || preciovalle > preciollana);
                    System.out.println("Introduce el tiempo que ha estado en funcionanmiento en hora punta:");
                    tiempoPunta = entradaTeclado.nextDouble();
                    System.out.println("Introduce el tiempo que ha estado en funcionanmiento en hora llana:");
                    tiempoLlana = entradaTeclado.nextDouble();
                    System.out.println("Introduce el tiempo que ha estado en funcionanmiento en hora valle:");
                    horaValle = entradaTeclado.nextDouble();

                    horaPunta = consumoVatios / W_KW * precioPunto * tiempoPunta;
                    consumoLlana = consumoVatios / W_KW * preciollana * tiempoLlana;
                    consumoValle = consumoVatios / W_KW * preciovalle * horaValle;
                    consumoTotal = horaPunta + consumoLlana + consumoValle;
                    System.out.printf("El consumo en euros es de %.2f ", consumoTotal);
                    break;
            }
        } while (opcion != 0);
    }

}
