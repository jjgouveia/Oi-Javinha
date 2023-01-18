package edu.aulasDio.Arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = { 1, -5, 30, -15, 5, 4 };

        for (int i = vetor.length-1 ; i > 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
