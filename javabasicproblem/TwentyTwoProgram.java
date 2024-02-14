
package com.mycompany.javabasicproblem;


import java.util.*;

public class TwentyTwoProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int alphaCount = 0;
        int digitCount = 0;
        int speCharCount = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (Character.isLetter(ch))
            {
                alphaCount++;
            } 
            else if (Character.isDigit(ch))
            {
                digitCount++;
            } 
            else
            {
                speCharCount++;
            }
        }

        System.out.println("Total alphabets: " + alphaCount);
        System.out.println("Total digits: " + digitCount);
        System.out.println("Total special characters: " + speCharCount);
    }
}
