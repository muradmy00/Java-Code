
package com.mycompany.javabasicproblem;

import java.util.*;

public class SixteenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        ch = input.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Character is a vowel.");
                break;
            default:
                System.out.println("Character is a consonant.");
                break;
        }
    }
}
