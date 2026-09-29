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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] tabuleiro = new double[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = 0.0;
            }
        }

        int naviosPosicionados = 0;
        while (naviosPosicionados < 5) {
            System.out.println("Digite a coordenada linha do " + (naviosPosicionados+1) + "o navio: ");
            int l = ler.nextInt();
            
            while (l >= 8 || l < 0){
                System.out.println("Coordenada linha invalida. Utilize coordenadas de 0 a 7");
                System.out.println("\nDigite a coordenada linha do " + (naviosPosicionados+1) + "o navio: ");
                l = ler.nextInt();
            }
            System.out.println("Digite a coordenada coluna do " + (naviosPosicionados+1) + "o navio: ");
            int c = ler.nextInt();
            
            while (c >= 8 || c < 0){
                System.out.println("Coordenada coluna invalida. Utilize coordenadas de 0 a 7");
                System.out.println("\nDigite a coordenada coluna do " + (naviosPosicionados+1) + "o navio: ");
                c = ler.nextInt();
            }
            if (l >= 0 && l < 8 && c >= 0 && c < 8) {
                if (tabuleiro[l][c] == 0.0) {
                    tabuleiro[l][c] = 1.0;
                    naviosPosicionados++;
                }
            }
        }

        int disparosRealizados = 0;
        int acertos = 0;
        int erros = 0;
        int repetidos = 0;

        while (disparosRealizados < 15 && acertos < 5) {
            System.out.println("\nDigite a coordenada linha do " + (disparosRealizados+1) + "o disparo: ");
            int l = ler.nextInt();
            while (l >= 8 || l < 0){
                System.out.println("Coordenada linha invalida. Utilize coordenadas de 0 a 7");
                System.out.println("\nDigite a coordenada linha do " + (disparosRealizados+1) + "o disparo: ");
                l = ler.nextInt();
            }
            System.out.println("\nDigite a coordenada coluna do " + (disparosRealizados+1) + "o disparo: ");
            int c = ler.nextInt();
            while (c >= 8 || c < 0){
                System.out.println("Coordenada coluna invalida. Utilize coordenadas de 0 a 7");
                System.out.println("\nDigite a coordenada linha do " + (disparosRealizados+1) + "o disparo: ");
                l = ler.nextInt();
            }
            if (l >= 0 && l < 8 && c >= 0 && c < 8) {
                if (tabuleiro[l][c] == 1.0) {
                    tabuleiro[l][c] = 2.0;
                    acertos++;
                    System.out.println("\nNavio atingido");
                }
                else if (tabuleiro[l][c] == 0.0) {
                    tabuleiro[l][c] = 3.0;
                    erros++;
                    System.out.println("\nAgua");
                }
                else {
                    repetidos++;
                    System.out.println("\nDisparo repetido");
                }
               
                disparosRealizados++;
            }
        }

        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Repetidos: " + repetidos);
    }
    
}
