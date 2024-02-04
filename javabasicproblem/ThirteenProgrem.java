package com.mycompany.javabasicproblem;

import java.util.*;

public class ThirteenProgrem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        if (isPalindrome(num)) 
        {
            System.out.println(num + " is a palindrome number.");
        } 
        else 
        {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int number = num;
        int rev = 0;

        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num /= 10;
        }

        return number == rev;
    }
}
