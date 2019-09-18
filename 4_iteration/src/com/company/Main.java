//4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//6 6 . . . nth iteration.
//Input: 5
//Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Number=input.nextInt();
        for(int i=1;i<=Number;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
