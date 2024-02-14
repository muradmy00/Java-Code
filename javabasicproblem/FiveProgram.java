
package com.mycompany.javabasicproblem;

import java.util.*;

class Reverse{
    int rever(int n)
    {
        int rem,rev = 0;
        while(n>0){
            rem = n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
}

public class FiveProgram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        Reverse ob = new Reverse();
        System.out.println("Reverse Number is"+ob.rever(n));
    }
    
}
