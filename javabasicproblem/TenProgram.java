
package com.mycompany.javabasicproblem;

import java.util.*;

public class TenProgram {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        if(n%2==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
