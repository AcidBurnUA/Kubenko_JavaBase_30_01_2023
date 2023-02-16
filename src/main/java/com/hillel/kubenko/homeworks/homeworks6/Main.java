package com.hillel.kubenko.homeworks.homeworks6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float te1play1=0,te1play2=0,te1play3=0,te1play4=0,te1play5=0;
        System.out.println("Имя команди 1");
        String name1team1 = s.nextLine();

         System.out.println("Ввести кількість фрагів першого гравця");
        if (s.hasNextInt()) {
            te1play1 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів другого гравця");
        if (s.hasNextInt()) {
            te1play2 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів третього гравця");
        if (s.hasNextInt()) {
            te1play3 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів четвертого гравця");
        if (s.hasNextInt()) {
            te1play4 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів пятого гравця");
        if (s.hasNextInt()) {
            te1play5 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
        float point1 = (te1play1+te1play2+te1play3+te1play4+te1play5)/5;

        float te2play1=0,te2play2=0,te2play3=0,te2play4=0,te2play5=0;
        s = new Scanner(System.in);
        System.out.println("Имя команди 2");
        String name1team2 = s.nextLine();

         System.out.println("Ввести кількість фрагів першого гравця");
        if (s.hasNextInt()) {
            te2play1 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів другого гравця");
        if (s.hasNextInt()) {
            te2play2 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів третього гравця");
        if (s.hasNextInt()) {
            te2play3 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів четвертого гравця");
        if (s.hasNextInt()) {
            te2play4 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
         System.out.println("Ввести кількість фрагів пятого гравця");
        if (s.hasNextInt()) {
            te2play5 = s.nextInt();
        } else {
            System.out.println("Помилка перезапустіть програму");
            System.exit(0);
        }
        float point2 = (te2play1+te2play2+te2play3+te2play4+te2play5)/5;
        System.out.println(point1);
        System.out.println(point2);
        if (point1>point2) {
            System.out.println("Перемогла команда "+name1team1+"\tНабрала " +point1+" очків");
        }
        else if (point1<point2) {
            System.out.println("Перемогла команда "+name1team2+"\tНабрала " +point2+" очків");
        }
        else {
            System.out.println("Нічія");
            System.exit(0);
        }
    }
}
