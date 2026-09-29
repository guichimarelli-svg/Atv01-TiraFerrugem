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
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] matriz = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento da linha " + (i+1) + " e coluna " + (j+1) + ":");
                matriz[i][j] = ler.nextDouble();
            }
        }

        boolean condicao1 = true;
        boolean condicao2 = true;
        boolean condicao3 = true;
        boolean condicao4 = true;

        int[] contagem = new int[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = (int) matriz[i][j];
                if (valor >= 1 && valor <= 9) {
                    contagem[valor]++;
                } else {
                    condicao1 = false;
                }
            }
        }
        
        for (int i = 1; i <= 9; i++) {
            if (contagem[i] != 1) {
                condicao1 = false;
            }
        }

        double somaReferenciaLinha = matriz[0][0] + matriz[0][1] + matriz[0][2];
        for (int i = 1; i < 3; i++) {
            double soma = matriz[i][0] + matriz[i][1] + matriz[i][2];
            if (soma != somaReferenciaLinha) {
                condicao2 = false;
            }
        }

        double somaReferenciaColuna = matriz[0][0] + matriz[1][0] + matriz[2][0];
        for (int j = 1; j < 3; j++) {
            double soma = matriz[0][j] + matriz[1][j] + matriz[2][j];
            if (soma != somaReferenciaColuna) {
                condicao3 = false;
            }
        }

        double somaDiagPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        double somaDiagSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        if (somaDiagPrincipal != somaDiagSecundaria) {
            condicao4 = false;
        }

        if (condicao1 && condicao2 && condicao3 && condicao4) {
            System.out.println("Matriz magica.");
        } else {
            System.out.println("Nao e matriz magica.");
            if (!condicao1) {
                System.out.println("Motivo: Nao contem os numeros de 1 a 9 sem repeticao.");
            }
            if (!condicao2) {
                System.out.println("Motivo: Linhas nao possuem a mesma soma.");
            }
            if (!condicao3) {
                System.out.println("Motivo: Colunas nao possuem a mesma soma.");
            }
            if (!condicao4) {
                System.out.println("Motivo: Diagonais nao possuem a mesma soma.");
            }
        }
    }
    
}
