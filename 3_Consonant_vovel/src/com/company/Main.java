//3. Create a program that accepts a word as input and checks for each single character letter in
//the word whether it is a consonant or vowel.
//Condition:
//a. Print an error message if the input is not a letter
//b. If the input having more than one letter, print the required output
//(Vowel or Consonant) for each letter
//Input : p
//Output : Consonant
//Input : ap
//Output : Vowel Consonant (should it be a - vowel, p - consonant)
//-------------------------------------------------------------------------------------------------------------------------
package com.company;

import java.util.Scanner;
import java.io.*;
import java.util.Vector;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your word: ");
        String Word=input.next();
        for(int i=0;i<Word.length();i++)
        {
            int n=Word.charAt(i);
            if((Word.charAt(i)>=65&&Word.charAt(i)<=90)||(Word.charAt(i)>=97&&Word.charAt(i)<=122))
            {
                if(Word.charAt(i)=='A'||Word.charAt(i)=='A'+32||Word.charAt(i)=='E'||Word.charAt(i)=='E'+32||Word.charAt(i)=='I'||Word.charAt(i)=='I'+32||Word.charAt(i)=='O'||Word.charAt(i)=='O'+32||Word.charAt(i)=='U'||Word.charAt(i)=='U'+32)
                    System.out.println(Word.charAt(i)+" - Vowel");
                else
                    System.out.println(Word.charAt(i)+" - Consonant");
            }
            else
                System.out.println("Letter is not Alphabet");

        }
    }
//        Vector output = new Vector();
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word=input.next();
//        for(int i=0;i<word.length();i++)
//        {
//            if((word.charAt(i)=='A'||word.charAt(i)=='A'+32)||(word.charAt(i)=='E'||word.charAt(i)=='E'+32)||(word.charAt(i)=='A'||word.charAt(i)=='I'+32)||(word.charAt(i)=='I'||word.charAt(i)=='O'+32)||(word.charAt(i)=='O'||word.charAt(i)=='U'+32)||(word.charAt(i)=='A'||word.charAt(i)=='U')||)
//            {
//                output.add((word.charAt(i)+"-Vowel ");
//            }
//            if(((word.charAt(i)>=65)&&(word.charAt(i)<=90))||(word.charAt(i)>=97&&(word.charAt(i)<=122)))
//            {
//                output.add(word.charAt(i)+"Consonant");
//            }
//            else
//            {
//                System.out.println("oops! something went wrong.");
//                return;
//            }
//        }
//        System.out.println(output);
//    }
}
