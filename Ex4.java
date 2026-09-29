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
public class Ex4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] original = new double[5][5];
        double[][] rotacionada = new double[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o elemento da linha " + (i+1) + " e coluna " + (j+1) + ":");
                original[i][j] = ler.nextDouble();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rotacionada[j][4 - i] = original[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Matriz rotacionada: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
