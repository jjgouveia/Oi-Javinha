package edu.aulasDio.controleDeFluxo;

import java.util.Scanner;

public class DiasDaSemanaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        int dia = sc.nextInt();
        sc.close();

        String diaString = "";
        
        switch (dia) {
            case 1:
                diaString = "Domingo";
                break;
            case 2:
                diaString = "Segunda";
                break;
            case 3:
                diaString = "Terça";
                break;
            case 4:
                diaString = "Quarta";
                break;
            case 5:
                diaString = "Quinta";
                break;
            case 6:
                diaString = "Sexta";
                break;
            case 7:
                diaString = "Sábado";
                break;
            default:
            System.out.println("Digite SOMENTE um valor entre 1 e 7");
                break;
        }

        System.out.println(diaString);
    }

    
}
