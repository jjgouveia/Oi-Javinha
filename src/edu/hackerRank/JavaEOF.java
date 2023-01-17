package edu.hackerRank;

import java.util.Scanner;

public class JavaEOF {

          /***
         * Este método itera uma contagem
         * de acordo com a quantidade de vezes
         * que é recebido algo na entrada.
         * Uma vez que a entrada seja vazia,
         * o código para.
         * 
         */
        
    public static void main(String[] args) {

  
        Scanner sc = new Scanner(System.in);
    
        int i = 1;
            while(sc.hasNext()){
                System.out.println(i+" "+sc.nextLine());
                i++;
            }
            
            sc.close();
    
        }
    }

