package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("PLEASE READ THE FOLLOWING CAREFULLY AND CHOOSE A NUMBER CORRESPONDING TO PROGRAM YOU WANT TO RUN");
        System.out.println("1. This program will check whether the number is palindrome or not. Also will tell the sum of even numbers is more or less than 25. ");
        System.out.println("2. This program will print tom (for even number) and jerry (for odd number) for number between 20 and 30.");
        System.out.println("3. This program will tell you the vowel and consonants in a word. For non alphabetic letters, error message will print");
        System.out.println("4. This program will print a magic pattern. (for example: if you entered 3 then output will be 1 2 2 3 3 3.");
        System.out.println("5. This program will take only integer values separated by a space and will print the sum of all integer values.");
        System.out.println("6. This program will tell you about the class of a letter.");
        System.out.println("7. This program will sort the number in non-increasing order and will print the sorted number and sum of even digits.");
        System.out.println("8. This program is more like game and will let you guess a fix number.");
        System.out.println("9. This program will print the string in reverse order. ");
        System.out.println("10. This program will print the input string along with repeated letters as many times as entered number(for example: input = stackroute, 2, output=stackrotetete");
        System.out.println("ENTER YOUR CHOSEN NUMBER HERE: ");
        int chosenNumber=scanner.nextInt();
        switch(chosenNumber){
            case 1:
                checkPalindrome objPalindrome=new checkPalindrome();
                objPalindrome.isPalindrome();
                break;
            case 2:
                tomAndJerry objTomAndJerry =new tomAndJerry();
                objTomAndJerry.tomForOddAndJerryForEven();
                break;
            case 3:
                checkVowelAndConsonant objcheckVowelAndConsonant =new checkVowelAndConsonant();
                objcheckVowelAndConsonant.vowelAndConsonant();
                break;
            case 4:
                magicPattern objMagicPattern=new magicPattern();
                objMagicPattern.printMagicPattern();
                break;
            case 5:
                sumOnlyIntegers objSumOnlyIntegers=new sumOnlyIntegers();
                objSumOnlyIntegers.printSumOfOnlyIntegers();
                break;
            case 6:
                checkLetter objcheckLetter=new checkLetter();
                objcheckLetter.displayCheckedLetter();
                break;
            case 7:
                sortAndSum objSortAndSum =new sortAndSum();
                objSortAndSum.displaySortedNumberAndSumOfEven();
                break;
            case 8:
                checkGuessNumber objCheckGuessNumber=new checkGuessNumber();
                objCheckGuessNumber.guessNumber();
                break;
            case 9:
                reverseString objReverseString = new reverseString();
                objReverseString.displayReverseString();
                break;
            case 10:
                repeatLastLetters objRepeatLastLetters = new repeatLastLetters();
                objRepeatLastLetters.displayRepeatLastLetters();
                break;
            default:
                System.out.println("You have entered wrong number");
                break;
        }

    }
}
