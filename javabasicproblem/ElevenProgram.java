package com.mycompany.javabasicproblem;

import java.util.*;


public class ElevenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String rev = Reverse(s);
        
        System.out.println(rev);
    }
    
        public static String Reverse(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
