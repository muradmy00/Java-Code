
package com.mycompany.javabasicproblem;

public class TwentyProgram {

    public static void main(String[] args) {
        int[] arr = {55, 95, 91, 0, 94, 11};

        int a = SecLargest(arr);

        if (a != -1) 
        {
            System.out.println("Second largest element is: " + a);
        } 
        else
        {
            System.out.println("Invalid input array");
        }
    }

    public static int SecLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > lar) {
                secLar = lar;
                lar = num;
            } else if (num > secLar && num != lar) {
                secLar = num;
            }
        }

        return secLar;
    }
}
