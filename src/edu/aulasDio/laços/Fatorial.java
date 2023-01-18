package edu.aulasDio.laços;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Fatorial: ");
        int fatorial = sc.nextInt();
        System.out.println("----------------------------------");
        int result = 1;

        while (fatorial < 0) {
            System.out.println("Insira somente números positivos!");
            System.out.println("Digite um valor válido: ");
            fatorial = sc.nextInt();
        }

        for (int i = fatorial; i > 1; i--) {
            result *= i;
        }
        sc.close();
        System.out.println(fatorial + "! é igual a: " + result + ".");
    }
}
