
package com.mycompany.javabasicproblem;

 
import java.util.*; 
import java.io.*;
import java.lang.*;

public class TwentyOneProgram { 
    

	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
                String s;
                s=input.nextLine();
                StringBuilder input1 = new StringBuilder();
                input1.append(s);
                input1.reverse();
                System.out.println(input1);
	} 
} 

