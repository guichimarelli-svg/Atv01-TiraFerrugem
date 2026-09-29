/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author fef
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[15];
        int[] comparacao = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero: ");
            numeros[i] = ler.nextInt();
        }

        int cont = 0;
        for (int i = 0; i < 15; i++) {
            boolean repetido = false;

            for (int j = 0; j < cont; j++) {
                if (numeros[i] == comparacao[j]) {
                    repetido = true;
                }
            }
            if(repetido == false){
                comparacao[cont] = numeros[i];
                cont++;
            }
        }
        
        System.out.println("Valores distintos: ");
        for(int z = 0; z < cont; z++){
            System.out.println(comparacao[z]);
        }
        System.out.println("Total de valores diferentes: " + cont);
    }
}
