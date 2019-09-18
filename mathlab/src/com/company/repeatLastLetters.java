package com.company;

import java.util.Scanner;

public class repeatLastLetters {
    public void displayRepeatLastLetters() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string of your choice : ");
        String enteredString=scanner.next();
        System.out.println("Enter number which is less than length of entered string:");
        int enteredNumber=scanner.nextInt();
        if(enteredNumber>enteredString.length()) {
            System.out.println("You have entered greater number than length of string");
            return;
        }
        System.out.print(enteredString);
        for(int j=0;j<enteredNumber;j++)
        {
            for (int i = enteredString.length() - enteredNumber; i < enteredString.length(); i++)
            {
                System.out.print(enteredString.charAt(i));
            }
        }
    }
}
