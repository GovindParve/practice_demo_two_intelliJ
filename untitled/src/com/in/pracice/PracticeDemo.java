package com.in.pracice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class PracticeDemo {

    public static void main(String[] args) {
        System.out.println("Java");

        //Find Occurrences of substring str2 in string str1
        //o/p=> 2
        /*String str1 = "ABCDCDC";
        String str2 = "CDC";

        char str12[] = str1.toCharArray();
        char str22[] = str2.toCharArray();

        int count = 0;

        char str1Arr[] = str1.toCharArray();


        for(int i = 0; i<str2.length(); i++){
            count = 0;
            char charecter = str2.charAt(i);
            //String charecter1 = String.valueOf(charecter);

            for(int j=0; j<str1.length(); j++)
            {
                if(charecter == str1.charAt(j)){
                    count++;
                }
            }
            System.out.println("count 1 :- "+count);
        }*/
       // System.out.println("count :- "+count);

        /*#program to print pyramid of n steps
#Example
#i/p n =  5
#o/p =>
# *
# ***
#  *****
# *******
# *********  */

        /*     *
         #    ***
         #   *****
         #  *******
         # ********* */

        int n = 5;
        pyramidPattern1(n);
        pyramidPattern2(n);
        pyramidPattern3(n);
        String str1= "govind";
        revreseString(str1);

        PracticeDemo practiceDemo = new PracticeDemo();
        practiceDemo.mapDemo();

        checkPrimeNumber(7);
        primeNumber1ToN(150);

        List<Integer> list2 = Arrays.asList(3,90,1,77,6,9);
        //int sl = list2.().max(Integer::intValue).get;

//        List<Integer> list = Arrays.asList(67,43,78,34,32,26,87,3);
//        int max1=0, max2=0;
//        for (int i = )
    }

//    Collections
//    ConcurrentHashMap

    public static void pyramidPattern1(int n){
        int i, j;
        System.out.println("First Pyramid pattern");
        for(i = 0; i< n; i++)
        {
            System.out.print(" ");
            for(j = 0; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidPattern2(int n){
        int i, j;
        System.out.println("\nSecond Pyramid pattern\n");
        for(i = 0; i< n; i++)
        {
            for(j = 2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            for(j = 0; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidPattern3(int n){
        int i, j;
        System.out.println("\nThird Pyramid pattern\n");
        for(i = 0; i<n; i++){
            for(j=2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void revreseString(String str1){

        String str2="";

        System.out.println("str1 :- "+str1);
        for(int i=str1.length()-1; i>=0; i--){
            str2 = str2+str1.charAt(i);
        }
        System.out.println("str2 :- "+str2);

        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb = sb.reverse();
        System.out.println("sb :- "+sb);

        char charArray[] = str1.toCharArray();
        String str3 = "";
        for(int i=charArray.length-1; i>=0; i--){
            str3 = str3+charArray[i];
        }
        System.out.println("str3 :- "+str3);

        int a=20,b=10, temp = 0;

        System.out.println("Before swap a= "+a+" b= "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a= "+a+" b= "+b);

        String str4 = "parve";
        int count = 0;
        for(int i=0; i<str1.length()-1; i++)
        {
            count++;
        }
        System.out.println("Number of words in string str4:- "+str4 +" is:- "+count);
    }

    public void mapDemo(){

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>(0);
        hashMap.put(101, "Vijay");
        hashMap.put(102, "Sandeep");
        hashMap.put(103, "Mahesh");
        hashMap.put(104, "Ramesh");
        hashMap.put(105, "Anil");

        System.out.println("Map Size:- "+hashMap.size());
        Iterator itr = hashMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is:- "+me.getKey()+" Value is:- "+me.getValue());
        }
        System.out.println("\nMap Elements using for loop:-\n");
        for(Map.Entry me: hashMap.entrySet()){
            System.out.println("Key is:- "+me.getKey()+" Value is:- "+me.getValue());
        }
    }

    //function to check given number is prime or not
    public static void checkPrimeNumber(int num){
        int temp;
        boolean isPrime = true;

        for(int i=2; i<=num/2; i++){
            temp = num%i;
            System.out.println("temp :- "+temp);
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num+" number is prime");
        else
            System.out.println(num+" number is not prime");
    }
    public static void primeNumber1ToN(int n){

        int i =0, num1 = 0;
        String primeNumbers = "";
        for(i =1; i<=n; i++){
            int counter = 0;
            for(num1=i; num1>=1; num1--){
                if (i%num1 == 0)
                    counter = counter+1;
            }
            if(counter == 2)
                primeNumbers = primeNumbers+i+" ";
        }
        System.out.println("Prime numbers from 1 to 100 are:");
        System.out.println(primeNumbers);
    }


}
