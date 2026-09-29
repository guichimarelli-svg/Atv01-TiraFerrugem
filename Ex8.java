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
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] assentos = new double[10][12];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                assentos[i][j] = 0.0;
            }
        }

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\nAssentos do cinema\nEscolha uma das opcoes a seguir: ");
            System.out.println("\n[1] Reservar um assento");
            System.out.println("[2] Cancelar uma reserva");
            System.out.println("[3] Exibir mapa");
            System.out.println("[4] Qtd de assentos livres e ocupados");
            System.out.println("[5] Encontrar sequencia de assentos livres");
            System.out.println("[6] Encerrar");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
                int ocupado = 1;
                while (ocupado == 1) {
                    System.out.println("Escolha a linha do assento: ");
                    int linha = ler.nextInt();

                    while (linha < 0 || linha > 9) {
                        System.out.println("linha invalida. Escolha entre 0 e 9");
                        System.out.println("\nEscolha a linha do assento: ");
                        linha = ler.nextInt();
                    }

                    System.out.println("Escolha a coluna do assento: ");
                    int coluna = ler.nextInt();

                    while (coluna < 0 || coluna > 11) {
                        System.out.println("coluna invalida. Escolha entre 0 e 9");
                        System.out.println("\nEscolha a coluna do assento: ");
                        coluna = ler.nextInt();
                    }

                    if (assentos[linha][coluna] == 0.0) {
                        assentos[linha][coluna] = 1.0;
                        System.out.println("\nAssento reservado com sucesso");
                        ocupado = 0;
                    } else {
                        System.out.println("Assento ocupado");
                        ocupado = 1;
                    }
                }
            } else if (opcao == 2) {
                System.out.println("Escolha a linha do assento: ");
                int linha = ler.nextInt();

                while (linha < 0 || linha > 9) {
                    System.out.println("linha invalida. Escolha entre 0 e 9");
                    System.out.println("\nEscolha a linha do assento: ");
                    linha = ler.nextInt();
                }

                System.out.println("Escolha a coluna do assento: ");
                int coluna = ler.nextInt();

                while (coluna < 0 || coluna > 11) {
                    System.out.println("coluna invalida. Escolha entre 0 e 9");
                    System.out.println("\nEscolha a coluna do assento: ");
                    coluna = ler.nextInt();
                }

                if (assentos[linha][coluna] == 1.0) {
                    assentos[linha][coluna] = 0.0;
                    System.out.println("\nReserva cancelada com sucesso");

                }
                else{
                    System.out.println("Assento selecionado está vezio");
                }
            } else if (opcao == 3) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 12; j++) {
                        System.out.print(assentos[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (opcao == 4) {
                int livres = 0;
                int ocupados = 0;
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 12; j++) {
                        if (assentos[i][j] == 0.0) {
                            livres++;
                        } else {
                            ocupados++;
                        }
                    }
                }
                System.out.println("Livres: " + livres);
                System.out.println("Ocupados: " + ocupados);
            } 
            else if (opcao == 5) {
                System.out.println("\nDigite a quantidade de pessoas que vao se assentar: ");
                int qtdPessoas = ler.nextInt();
                boolean encontrou = false;

                for (int i = 0; i < 10 && !encontrou; i++) {
                    int consecutivos = 0;
                    for (int j = 0; j < 12 && !encontrou; j++) {
                        if (assentos[i][j] == 0.0) {
                            consecutivos++;
                            if (consecutivos == qtdPessoas) {
                                System.out.println("Fileira: " + i);
                                System.out.print("Assentos: ");
                                for (int k = j - qtdPessoas + 1; k <= j; k++) {
                                    System.out.print(k + " ");
                                }
                                System.out.println();
                                encontrou = true;
                            }
                        } else {
                            consecutivos = 0;
                        }
                    }
                }
            }
        }
        System.out.println("\nSistema encerrado!");
    }

}
