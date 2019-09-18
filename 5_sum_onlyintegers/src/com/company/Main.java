//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values
//Input : 12 23 2 4
//Output : 41
package com.company;

import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args)
//    {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter Your Numbers one by one: ");
//        int Number;
//        int Sum=0;
//        while((Number=input.nextInt())!=0)
//        {
//            Sum+=Number;
//        }
//        System.out.println("Output: "+Sum);
//    }
//}
public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Numbers separated by one space: ");
        String Number=input.nextLine();
        int sum=0;
        int var=0;
        for(int i=0;i<Number.length();i++)
        {
            if((Number.charAt(i)<'0'||Number.charAt(i)>'9')&&(Number.charAt(i)!=' '))
            {
                System.out.println("You have not entered all numbers correctly, please try again");
                return;
            }
            else if(Number.charAt(i)==' ')
            {
                sum=sum+var;
                var=0;
            }
            else
            {
//                int temp=(int)Number.charAt(i)-'0';
//                System.out.println(temp);
                var=(var*10)+(int)Number.charAt(i)-'0';

//                System.out.println(var);

            }
        }
        sum=sum+var;
        System.out.println(sum);
    }
}
