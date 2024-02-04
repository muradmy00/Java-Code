
package com.mycompany.javabasicproblem;

import java.util.*;


public class SixProgram {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        int letters = 0;
        int digit=0,space=0,ch=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                digit++;
            }
            else if(s.charAt(i)==32)
            {
                space++;
            }
            else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                letters++;
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                letters++;
            }
            else if(s.charAt(i)>=33 && s.charAt(i)<=47){
                ch++;
            }
            else if(s.charAt(i)>=58 && s.charAt(i)<=64){
                ch++;
            }
            else if(s.charAt(i)>=91 && s.charAt(i)<=96){
                ch++;
            }
            else if(s.charAt(i)>=123 && s.charAt(i)<=126){
                ch++;
            }
            
        }
        System.out.println("Count off letters:"+" "+letters);
        System.out.println("Count off spaces:"+" "+space);
        System.out.println("Count off numbers:"+" "+digit);
        System.out.println("Count off characters:"+" "+ch);
        
    }
}
