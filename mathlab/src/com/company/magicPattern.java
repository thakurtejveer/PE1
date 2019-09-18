package com.company;

import java.util.Scanner;

public class magicPattern {
    public void printMagicPattern() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to get magic pattern: ");
        int enteredNumber=scanner.nextInt();
        for(int i=1;i<=enteredNumber;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
