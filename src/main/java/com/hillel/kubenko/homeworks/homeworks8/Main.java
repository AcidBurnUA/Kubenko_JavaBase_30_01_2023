package com.hillel.kubenko.homeworks.homeworks8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 //       1 спосіб
 //       int count = 0, value = 0;
 //      while (count < 100){
 //           String s = String.valueOf(++value);
 //           if ((s.contains("4") || s.contains("9"))) continue;
 //          System.out.println(value);
 //          count++;

 //         2 спосіб
          int counter = 0;
          for (int i = 0; counter <= 100; i++) {

             if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9
             || i % 100 == 9 || i % 100 == 4 || (i / 10) % 10 == 9 || (i / 10) % 10 == 4) {
          continue;
          }
            System.out.println("shuttle number = " + i);
             counter++;
           }



  }
}