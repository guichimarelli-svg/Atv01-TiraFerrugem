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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        double valor[][] = new double[4][4];
        int s;
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Informe o valor da linha " + l + " e coluna " + c);
                valor[l][c] = ler.nextDouble();
            }
        }
        double somaDiagonalP = 0;
        System.out.println(" O valor da matriz principal: ");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                if (l == c) {
                    System.out.println("Elemento " + c + ": " + valor[l][c]);
                    somaDiagonalP += valor[l][c];
                }
            }
        }
        double somaDiagonalS = 0;
        System.out.println(" O valor da matriz secundaria: ");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                s = l + c;
                if (s == 3) {
                    System.out.println("Elemento " + l + ": " + valor[l][c]);
                    somaDiagonalS += valor[l][c];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalP);
        System.out.println("Soma da diagonal secundaria: " + somaDiagonalS);
        
        if (somaDiagonalP > somaDiagonalS){
            System.out.println("A soma da diagonal principal e maior");
        }
        else if(somaDiagonalP < somaDiagonalS){
            System.out.println("A soma da diagonal secundaria e maior");
        }
        else{
            System.out.println("As somas de ambas diagonais sao iguais");
        }
    }

}
