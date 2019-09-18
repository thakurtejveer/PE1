package com.company;

import java.util.Scanner;
//import java.io.*;

public class Main {

    public static void main(String[] args) {
        String firstname, lastname;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name: ");
        firstname = input.next();
        System.out.println("Enter Last name: ");
        lastname = input.next();
//        System.out.println(firstname);
//        System.out.println(lastname);
        print(firstname, lastname);
    }

    public static void print(String name, String sirname) {
        System.out.printf("Your name is: %s %s", name, sirname);
    }
}
//import java.util.Scanner;
//
//class GetInputFromUser
//{
//    public static void Main(String args[])
//    {
//        // Using Scanner for Getting Input from User
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter string here: ");
//
//        String s = in.nextLine();
//        System.out.println("You entered string "+s);
//
//        int a = in.nextInt();
//        System.out.println("You entered integer "+a);
//
//        float b = in.nextFloat();
//        System.out.println("You entered float "+b);
//    }
//}
