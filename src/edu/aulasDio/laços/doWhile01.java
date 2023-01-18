package edu.aulasDio.laços;

import java.util.Scanner;

public class doWhile01 {

    /*
     * 🔸Maior e Média: Faça um programa que leia 5 números e informe o maior número
     * e a média desses números.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int i = 0;
        int soma = 0;
        int media = 0;

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            if(numero > maior) {
                maior = numero;
            }

            soma = soma + numero;
            media = soma / 5;

            i+=1;

        } while (i < 5);

        sc.close();

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + media);
    }
}
