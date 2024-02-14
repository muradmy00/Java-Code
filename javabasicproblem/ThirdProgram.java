
package com.mycompany.javabasicproblem;

import java.util.*;

public class ThirdProgram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println(a);
        System.out.println(b);
        
        
    }
    
}
