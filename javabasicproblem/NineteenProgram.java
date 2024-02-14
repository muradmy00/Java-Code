
package com.mycompany.javabasicproblem;


import java.util.*;

public class NineteenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0,b = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
