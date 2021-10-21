package com.company;

public class Main {

    public static void main(String[] args) {

//        int x = 12;
//        int y = 5;
//
//        if (x % y == 0) {
//            System.out.printf("%s divides exactly into %s%n", y, x);
//        } else {
//            System.out.printf("%s does not divide exactly into %s%n", y, x);
//        }
        for (int month = 1; month <=12; month++) {
            System.out.printf("The next month after %s is %s%n", month, month % 12 + 1);
        }
    }
}
