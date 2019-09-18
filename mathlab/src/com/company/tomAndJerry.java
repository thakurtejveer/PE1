package com.company;

import java.util.Scanner;

public class tomAndJerry {
    public void tomForOddAndJerryForEven() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number between 20 and 30: ");
        int enteredNumber=scanner.nextInt();
        if(enteredNumber>=20 && enteredNumber<=30)
        {
            if(enteredNumber%2==0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
        else
            System.out.println("Sorry, Entered number is not between 20 and 30");
        }

}
