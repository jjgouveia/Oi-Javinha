package edu.aulasDio.laços;

import java.util.Scanner;

public class ExWhile02 {
    /*
     * 🔸Nota: Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja inválido e continue pedindo
     * até que o usuário informe um valor válido.
     */

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double nota = 0;

            while (true) {
                System.out.println("Digite uma nota: ");
                nota = sc.nextDouble();

                if(nota < 0 || nota > 10) {
                    System.out.println("Digite uma nota entre 0 e 10.");
                    continue;
                } else {
                    System.out.println("A nota foi: " + nota);
                    sc.close();
                    break;
                }
            }
            // do {
            //     System.out.println("Digite uma nota: ");
            //     nota = sc.nextDouble();
            // } while (nota < 0 || nota > 10);

            // System.out.println("A nota foi: " + nota);
            System.out.println("Aplicação encerrada");
        }
     }
}
