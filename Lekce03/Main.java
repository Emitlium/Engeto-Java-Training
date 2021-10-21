package com.engeto.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    // == Methods ==
//    public static List listBuilder (List<Integer> list){
//        int i = 1;
//        //while (i != 101){
//        while (i != 10){
//            list.add(i);
//            i++;
//        }
//        return list;
//    }
//    // nepotřebuju, ten je můj ať vím jestli se děje to co chci
//    public static void listPrinter(List<Integer> list) {
//        for (Integer i : list){
//            System.out.println(i);
//        }
//        System.out.println(list);
//    }
//
//    public static List listDivisionChecker (List<Integer> list){
//        List<String> helper = new ArrayList<String>();
//
//        for (Integer i : list){
//            if (i % 3 == 0 && i % 5 == 0){
//                helper.add(i, "FizzBuzz");
//            } else if (i % 3 == 0){
//                helper.add(i, "Fizz");
//            } else if (i % 5 == 0){
//                helper.add(i,"Buzz");
//            } else helper.add(i,Integer.toString(i));
//        }
//        return helper;
//    }
//
//    // == Main Method ==
//    public static void main(String[] args) {
//
//        List<Integer> list1To100 = new ArrayList<Integer>();
//
//        //test - vytvoř list - ok
//        listBuilder(list1To100);
//        // test - vytiskni list - ok
//        listPrinter(list1To100);
//        //test - nahrazování - nok
//        listDivisionChecker(list1To100);
//
//    }
//}

// znovu a bez arrays



public class Main {

    // == metoda for loop s podmínkami dělitelné 3&5 FizzBuzz, 3 Fizz, 5 Buzz, zbytek číslo (kámen úrazu předtím)
    public static void list1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // == main ==
    public static void main(String[] args) {
        // metoda list test
        list1To100();

    }
}