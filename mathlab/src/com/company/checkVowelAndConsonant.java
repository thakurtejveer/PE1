package com.company;

import java.util.Scanner;

public class checkVowelAndConsonant {
    public void vowelAndConsonant() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter word to check consonant and vowel: ");
        String enteredWord=scanner.next();
        for(int i=0;i<enteredWord.length();i++)
        {
            int num=enteredWord.charAt(i);
            if((num>=65&&num<=90)||(num>=97&&num<=122))
            {
                if(num=='A'||num=='A'+32||num=='E'||num=='E'+32||num=='I'||num=='I'+32||num=='O'||num=='O'+32||num=='U'||num=='U'+32)
                    System.out.println(enteredWord.charAt(i)+" - Vowel");
                else
                    System.out.println(enteredWord.charAt(i)+" - Consonant");
            }
            else
                System.out.println(enteredWord.charAt(i)+" - Not an Alphabet");

        }

    }
}
