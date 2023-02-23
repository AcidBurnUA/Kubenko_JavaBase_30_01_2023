package com.hillel.kubenko.homeworks.homeworks9;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sum = 0,sum2 = 0,a = 0,b = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (40 - 18 + 1)) + 18;
            team2[i] = (int) (Math.random() * (40 - 18 + 1)) + 18;
        }
        System.out.print("Перша команда");
        for (int i = 0; i < team1.length; i++) {
            System.out.print(" " + team1[i]);
            sum += team1[i];
        }
        System.out.println(" ");
        System.out.print("Друга команда");
        for (int i = 0; i < team2.length; i++) {
            System.out.print(" " + team2[i]);
            sum2 += team2[i];
        }
        a = sum/team1.length;
        b = sum2/team2.length;
        System.out.println("\nСередній вік першої команди "+ a);
        System.out.println("Середній вік другої команди "+ b);
    }
}
