package com.in.pracice;

import java.util.stream.IntStream;

public class Java8FeaturesPracticeDemo {

    public static void main(String[] args) {

        //Arithmatic operations using Java 8 Lambda Expression
        Arithmatic addition = (int c,int d) -> c+d;
        Arithmatic subtraction = (int c,int d) -> c-d;
        Arithmatic multiplication = (int c,int d) -> c*d;
        Arithmatic division = (int c,int d) -> c/d;

        System.out.println("Arithmatic Operations using Java 8 Lambda Expression");
        System.out.println("Addition of a and b :- "+addition.operation(10,20));
        System.out.println("Subtraction of a and b :- "+addition.operation(10,20));
        System.out.println("Multiplication of a and b :- "+addition.operation(10,20));
        System.out.println("Division of a and b :- "+addition.operation(10,20));


        //Check a string Palindrome using Java 8 stream
        System.out.println("Is radar a palindrome? :- "+isPalindrome("radar"));
        System.out.println("Is apple a palindrome? :- "+isPalindrome("apple"));

    }

    public static boolean isPalindrome(String originalString){
        String tempString = originalString.replaceAll("//+s","").toLowerCase();
        return IntStream.range(0,tempString.length()/2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
    }



}

interface Arithmatic
{
    public int operation(int a, int b);
}
