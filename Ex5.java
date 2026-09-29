/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista1;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorOriginal = new int[20];
        int[] vetorOrdenado = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i+1) + "o numero:");
            vetorOriginal[i] = ler.nextInt();
            vetorOrdenado[i] = vetorOriginal[i];
        }

        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                comparacoes++;
                if (vetorOrdenado[j] > vetorOrdenado[j + 1]) {
                    int aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;
                    trocas++;
                }
            }
        }

        double mediana = (vetorOrdenado[9] + vetorOrdenado[10]) / 2.0;

        for (int i = 0; i < 20; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }
        System.out.println();

        System.out.println("Trocas: " + trocas);
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Mediana: " + mediana);
    }
    
}
