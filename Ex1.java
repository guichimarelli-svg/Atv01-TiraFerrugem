/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1;
    import java.util.Scanner;
/**
 *
 * @author fef
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double [10];
        double somaNotas = 0, mediaNotas = 0, maiorNota = 0, menorNota = 10;
        int aprovados = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = ler.nextDouble();
            
            if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota){
                menorNota = notas[i];
            }
            if (notas[i] >= 7){
                aprovados++;
            }
        }
        int contar = 0;
        for(int n = 0; n < 10; n++){
            somaNotas += notas[n];
            contar ++;
        }
        
        mediaNotas = somaNotas / contar;
        System.out.println("A média das notas é :" + mediaNotas);
        
        int abaixoDaMedia = 0;
        for(int z = 0; z < 10; z++){
            if (notas[z] < mediaNotas){
                abaixoDaMedia++;
            }
        }
        System.out.println("\nA maior nota e: " + maiorNota);
        System.out.println("\nA menor nota e: " + menorNota);
        System.out.println("\nA quantidade de alunos com nota maior ou igual a 7 e: " + aprovados);
        System.out.println("\nA quantidade de alunos abaixo da media e: " + abaixoDaMedia);
        
    }
}
