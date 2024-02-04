
package com.mycompany.javabasicproblem;

import java.util.*;

public class SeventeenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("first number: ");
        double num1;
        num1 = input.nextDouble();
        
        char ch;
        ch= input.next().charAt(0);

        System.out.print("second number: ");
        double num2;
        num2 = input.nextDouble();

        double ans;

        switch (ch) {
            case '+':
                ans = num1 + num2;
                System.out.println("Sum is: " + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println("Subtraction is: " + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println("Multiplication is: " + ans);
                break;
            case '/':
                if (num2 != 0) 
                {
                    ans = num1 / num2;
                    System.out.println("Division is: " + ans);
                } 
                else 
                {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
