package Lekce03.fizzbuzz;

 //==== FUNKČNÍ ====

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

    // == MAIN ==
    public static void main(String[] args) {
        // metoda list test - OK
        list1To100();
    }
}

//// ==== NEFUNKČNÍ ====
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    // == Methods ==
//
//    // = builder
//    public static List listBuilder (List<Integer> list){
//        int i = 1;
//        while (i != 101){
//            list.add(i);
//            i++;
//        }
//        return list;
//    }
//
//    //= printer
//    public static void listPrinter(List<Integer> list) {
//        for (Integer i : list){
//            System.out.println(i);
//        }
//    }
//
//    // = changer
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
//    // == MAIN ==
//    public static void main(String[] args) {
//
//        List<Integer> list1To100 = new ArrayList<Integer>();
//
//        //test - list vytvořena vytisknut - OK
//        //listPrinter(listBuilder(list1To100));
//
//        //test - check dělitelnosti - NOK
//        listPrinter(listDivisionChecker(listBuilder(list1To100)));
//    }
//}
