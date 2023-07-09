package com.in.pracice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPracticeDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to stream API");
        //create a list and filter all even numbers from list
        //
        //List<Integer> list1 = List.of(2,4,50,21,22,67); // List.of() Method introduced in java 9 so it will never work in java 8 version
//        List<Integer> list2 = new ArrayList<Integer>();
//        list2.add(2);
//        list2.add(81);
//        list2.add(3);
//        list2.add(78);
//        list2.add(8);
//        list2.add(99);
//
//        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);



        //list1
        //without stream
//        List<Integer> listEven = new ArrayList<>();
//
//        for (Integer i:list2){
//            if (i % 2 ==0){
//                listEven.add(i);
//            }
//        }
//
//        System.out.println(list2);
//        System.out.println(listEven);

        //using stream
        /*Stream<Integer> stream = list2.stream();
        List<Integer> newList = stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(newList);*/

//        List<Integer> newList = list2.stream().filter(i ->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);
//
//        List<Integer> newList1 = list2.stream().filter(i->i>10).collect(Collectors.toList());
//        System.out.println(newList1);







        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);


        List<Integer> newintegerList = integerList.stream().map(i -> i*3).collect(Collectors.toList());

        System.out.println(newintegerList);

        //int c =10, d = 20;

        //get max element from a list using java 8 stream fetures

        //integerList.stream().max(Comparator.comparing(Integer :: valueOf).get());

        List<Integer> lst2 = Arrays.asList(10,286,765,4,79,85,7);
        int max  = integerList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Element from a list :- "+max);

        List<Integer> list2 = Arrays.asList(12,354,76,43,7,34);
        System.out.println("list2 elments :-"+list2);
        int min = list2.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min Element from list :- "+min);

        int max1 = list2.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max1 :- "+max1);




        List<Integer> list1 = Arrays.asList(34,75,89,59,7,34,89,64,12);

        List<Integer> list3 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("List of even numbers : "+list3);

        List<Integer> list4 = list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("List of odd numbers : "+list4);

        int maxNo = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max element from the lis:- "+maxNo);
        int minNo = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min element from the list:- "+minNo);

        List<Integer> list5 = list1.stream().map(i-> i*5).collect(Collectors.toList());
        System.out.println("List after performing multiplication operation on it:- "+list5);

       Long count =  list1.stream().count();
       System.out.println("number of elements list is: "+count);

       List list6 = list1.stream().distinct().collect(Collectors.toList());
       System.out.println(" Distinct elements in the list:- "+list6);

       Optional<Integer> anyNo = list1.stream().findAny();
       System.out.println(" findAny() elements in the list:- "+anyNo);

        Optional<Integer> findFirst = list1.stream().findFirst();
        System.out.println(" findFirst() elements in the list:- "+findFirst);

        List<Integer> list7 = list1.stream().limit(3).collect(Collectors.toList());
        System.out.println(" limit() stream elements in the list:- "+list7);

       int sum = list1.stream().mapToInt(i->i).sum();
       System.out.println("Sum of list1:- "+sum);


        List<Integer> a = Arrays.asList(1,11,20,30);
        System.out.println("List A Original: "+a);
        List<Integer> a2 = a.stream().filter(i->i%2 !=0).map(i -> i+1).collect(Collectors.toList());
        System.out.println("List of Odd Numbers after adding 1 to each element: "+a2);









        List<Integer> list8 = Arrays.asList(43,56,89,34,56,71);

        long count1 = list8.stream().count();

        System.out.println("list8 count: "+count1);

        List<Integer> list9 = list8.stream().distinct().collect(Collectors.toList());

        System.out.println("Find distinct elements List: "+list9);

        List<Integer> list10 = list8.stream().filter(i -> i%2 !=0).map(i -> i*10).collect(Collectors.toList());
        System.out.println("Find odd numbers from the and mutipled it by 10:"+list10);

        //forEach() method implementation with stream api
        System.out.println("Find odd numbers from the list:"+list10);
        list8.stream().filter(i -> i%2 !=0).forEach(i->System.out.print(i+" "));
        System.out.println("\n*************************************");
        System.out.println("Mutipled list elements by 10:"+list10);
        list8.stream().map(i -> i*10).forEach(i->System.out.print(i+" "));
        System.out.println("\n*************************************");
        System.out.println("Find even numbers from the list and mutipled it by 10:"+list10);
        list8.stream().filter(i -> i%2 ==0).map(i -> i*10).forEach(i->System.out.print(i+" "));

        System.out.println("list: "+list8);
        int min1 = list8.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Find minimum element from the list: "+min1);
        int max2 = list8.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Find maximum element from the list: "+max2);






















    }


}


