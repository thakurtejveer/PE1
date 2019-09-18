//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values
//Input : 12 23 2 4
//Output : 41
package com.company;

import java.util.Scanner;

public class sumOnlyIntegers {
    public void printSumOfOnlyIntegers() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers separated by one space: ");
        String enteredString=scanner.nextLine();
        int sumOfIntegers=0;
        int number=0;
        for(int i=0;i<enteredString.length();i++)
        {
            if((enteredString.charAt(i)<'0'||enteredString.charAt(i)>'9')&&(enteredString.charAt(i)!=' '))
            {
                System.out.println("You have not entered all numbers correctly, please try again");
                return;
            }
            else if(enteredString.charAt(i)==' ')
            {
                sumOfIntegers+=number;
                number=0;
            }
            else
            {
//                int temp=enteredString.charAt(i)-'0';
//                System.out.println(temp);
                number=(number*10)+enteredString.charAt(i)-'0';

//                System.out.println(number);

            }
        }
        sumOfIntegers+=+number;
        System.out.println(sumOfIntegers);
    }
}
