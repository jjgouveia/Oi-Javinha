package edu.aulasDio.laços;

import java.util.Scanner;

public class ExWhile01 {

    /*
     * 🔸Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int idade = 0;

        while(true) {
            System.out.println("Digite o nome do Aluno: ");
            name = sc.next();

            if(name.equals("0")) {
                System.out.println(idade + " Laço encerrado");
                break;
            }
            System.out.println("Agora digite a idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Aplicação finalizada.");
        sc.close();

    }

}