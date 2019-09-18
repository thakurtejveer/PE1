//2. Write a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter Number: ");
        Scanner n=new Scanner(System.in);
        int Number=n.nextInt();
        isTom_Jerry(Number);
    }
    public static int isTom_Jerry(int number)
    {
        if(number>=20&&number<=30)
        {
            if(number%2==0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
        return 0;
    }
}
