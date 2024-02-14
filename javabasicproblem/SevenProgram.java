package com.mycompany.javabasicproblem;


import java.util.*;

public class SevenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password;
        password = input.nextLine();

        System.out.println("Your password is: " + password);
    }
}
