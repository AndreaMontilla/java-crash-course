package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++){
//      for (int i = 9; i > -1; i--){ another way to write the for statement
            System.out.printf("row %d ", i);
            for (int j = 0; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
