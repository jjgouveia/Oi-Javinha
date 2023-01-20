package edu.aulasDio.entendendoMetodosJava;

public class Emprestimo {
    public static void verificarDivida(double valorSolicitado, int parcelas, double taxa) {

        double taxas = taxa/10;
        double juros = parcelas * taxas;
        double resultado = valorSolicitado * juros;

        System.out.println("Valor total: " + resultado);
        
    }
}
