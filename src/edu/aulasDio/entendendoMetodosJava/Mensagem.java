package edu.aulasDio.entendendoMetodosJava;

public class Mensagem {

    public static void mensageria(int hora) {
        if(hora >= 0 & hora <= 12) System.out.println("Bom dia!");
        else if(hora > 12 & hora <= 18) System.out.println("Boa Tarde!");
        else System.out.println("Boa noite");
    }
}
