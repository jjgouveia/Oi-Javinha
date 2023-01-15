

package edu.hackerRank;

import java.util.*;

public class JavaDataTypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes quer repetir o teste?");
        int t=sc.nextInt();


        for(int i=0;i<t;i++)
        {
            try
            {
                System.out.println("Digite um valor:");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();

    }
}
