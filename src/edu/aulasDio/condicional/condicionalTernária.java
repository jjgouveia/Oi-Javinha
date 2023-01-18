package edu.aulasDio.condicional;

import java.util.Scanner;

public class condicionalTernária {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();
        sc.close();

        if (n1 == n2) {
            System.out.println("Os números são iguais");
            return;
        }
        
        String resultado = n1 > n2 ? "O primeiro número é o maior" : "O segundo número é o maior";

        System.out.println(resultado);
    }
}
