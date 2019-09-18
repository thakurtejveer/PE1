//9. Write a program to reverse any string without using String Buffer.
//Input : london
//Output : nodnol
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=input.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        return;
    }
}
