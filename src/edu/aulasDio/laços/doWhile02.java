package edu.aulasDio.laços;

import java.util.Scanner;

public class doWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número de repetições: ");
        int repeat = sc.nextInt();
        int count = 0;
        int soma = 0;
        int par = 0;
        int impar = 0;
    
    
        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;

            if(numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            count += 1;
            
        } while (count < repeat);

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("Qtde. de nº Par(es): " + par);
        System.out.println("Qtde. de nº Ímpar(es): " + impar);

        sc.close();
    }
}
