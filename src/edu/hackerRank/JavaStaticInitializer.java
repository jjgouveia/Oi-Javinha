package edu.hackerRank;

import java.util.*;

public class JavaStaticInitializer {

public static int B, H = 0;
public static boolean flag = true;

static {
    Scanner sc = new Scanner(System.in);
    
    try {
        System.out.println("Digite o valor da base: ");
        B = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor da altura: ");
        H = sc.nextInt();
        sc.close();
        
        if(B <= 0 || H <= 0) {
            flag = false;
            throw new Exception("Breadth and height must be positive");
    }} catch (Exception e) {
        System.out.println(e);
    }
}


public static void main(String[] args){
		if(flag){
			int area= B*H;
			System.out.print("A área é igual a: " + area);
		}
		
	}//end of main

}//end of class

