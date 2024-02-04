
package com.mycompany.javabasicproblem;

import java.util.*;
public class FirstProgram {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int sum,product;
        float divide;
        sum=a+b;
        divide=a/b;
        product=a*b;
        System.out.println(sum);
        System.out.println(divide);
        System.out.println(product);
        
    }
}
