package edu.aulasDio.laços;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o multiplicador da tuabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("-------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " vezes " + i + " = " + i * tabuada);
        }

        sc.close();
    }
}
