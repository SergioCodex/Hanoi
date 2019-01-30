/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Scanner;
import Sleer2.SLeer2;

/**
 * CLASE HANOI
 *
 * @author Sergio Granero García
 * @version 1.0
 */
public class Hanoi {

    //Atributos.
    static int cont;

    /**
     * PIDE UN NÚMERO.
     *
     * @return numero que el usuario introduzca, nunca menor a 0.
     */
    public static int pideNum() {
        int numero;

        do {
            numero = SLeer2.datoInt("\tIntroduzca un numero de discos[0 para salir]: ");
            System.out.println("\n");

            if (numero < 0) {
                System.err.println("\nEl número introducido es negativo, vuelva a intentarlo.");
            }

        } while (numero < 0);

        return numero;
    }

    /**
     * MÉTODO RECURSIVO PARA RESOLVER EL JUEGO DE LAS TORRES DE HANOI.
     *
     * @param n número de discos.
     * @param origen columna origen (1)
     * @param auxiliar columna auxiliar (2)
     * @param destino columna destino/fin (3)
     */
    public static void Hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println("- Mover disco de " + origen + " a " + destino);
            cont++;
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("- Mover disco de " + origen + " a " + destino);
            cont++;
            Hanoi(n - 1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        System.out.println("\t+-------------------------------+"
                + "\n\t|\t Torres de Hanoi\t|"
                + "\n\t+-------------------------------+"
                + "\n\t|      -        -        -    \t|"
                + "\n\t|     ---       -        -    \t|"
                + "\n\t|    -----      -        -    \t|"
                + "\n\t|   -------     -        -    \t|"
                + "\n\t+-------------------------------+");
        int discos = pideNum();
        System.out.println("\n\n");

        while (discos != 0) {
            Hanoi(discos, 1, 2, 3);

            System.out.println("\n>>> Número total de movimientos: " + cont);
            cont = 0;
            discos = pideNum();
        }

        System.out.println("\n~~ Fin del programa, hasta luego Lucas. ~~\n");
    }

}
