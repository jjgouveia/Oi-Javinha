package edu.aulasDio;

//Mmeu primeiro programa Java ❤️

import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String n1 = scan.next();
        System.out.println("Digite o Sobrenome: ");
        String n2 = scan.next();

        scan.close();

        String nomeCompleto = nomeCompleto(n1, n2);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return"Resultado: " + nome.concat(" ").concat(sobrenome)+ ".";
    }
}

 