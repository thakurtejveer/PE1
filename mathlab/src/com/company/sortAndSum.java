package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class sortAndSum {
    public void displaySortedNumberAndSumOfEven() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to sort in non-increasing order: ");
        int enteredNumber=scanner.nextInt();
        int sumOfEvenDigits=0;
        Vector digitsOfNumber = new Vector();
        while(enteredNumber>0)
        {
            digitsOfNumber.add(enteredNumber % 10);
            if((enteredNumber%10)%2==0)
                sumOfEvenDigits+=enteredNumber%10;
            enteredNumber /= 10;
        }
        Collections.sort(digitsOfNumber);
        System.out.print("Sorted number in non-increasing order :");
        for(int i=digitsOfNumber.size()-1;i>=0 ;i--)
        {
            System.out.print(digitsOfNumber.get(i));
        }
        System.out.println();
        System.out.println("Sum of even Numbers:" +sumOfEvenDigits);
        if(sumOfEvenDigits<15)
            System.out.println("false,(sum of even digits is less than 15)");
        else
            System.out.println("true, (sum of even digits is more than 15)");
    }
}
