package com.hillel.kubenko.homeworks.homeworks7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        double random = Math.random() * 10;
        int result = (int) Math.round(random);
        while (true) {
            System.out.println("Вгадай число");
            int number = s.nextInt();
            if (number == result) {
                System.out.println("Вгадав");
                break;
            } else if (a == 2) {
                System.out.println("Спроби закінчились");
                break;
            } else {
                System.out.println("Невірно");
                if (number < result) {
                    System.out.println("Бери число більше");
                } else if (number > result) {
                    System.out.println("Бери число менше");
                    a++;

                }
            }
        }
    }
}