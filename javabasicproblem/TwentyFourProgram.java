package com.mycompany.javabasicproblem;

import java.util.*;

public class TwentyFourProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : s.toCharArray())
        {
            if (Character.isLetter(ch) || Character.isDigit(ch)) 
            {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (char ch : frequencyMap.keySet()) 
        {
            System.out.println("" + ch + ":-" + frequencyMap.get(ch));
        }
    }
}
