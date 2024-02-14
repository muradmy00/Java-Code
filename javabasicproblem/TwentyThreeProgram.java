package com.mycompany.javabasicproblem;

import java.util.*;
public class TwentyThreeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s,subs;
        s = input.nextLine();
        subs = input.nextLine();

        if (s.contains(subs))
        {
            System.out.println("Substring is there!");
        } 
        else 
        {
            System.out.println("Substring not found!");
        }
    }
}
