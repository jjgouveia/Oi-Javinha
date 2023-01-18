package edu.aulasDio.condicional;

import java.util.Scanner;

public class condiçãoIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        scan.close();

        if (num1 > num2) {
            System.out.println("Primeiro número é maior.");
        } else {
            System.out.println("Segundo número é maior.");
        }
    }
}
