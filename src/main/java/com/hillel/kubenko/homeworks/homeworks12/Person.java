package com.hillel.kubenko.homeworks.homeworks12;
import java.util.Arrays;
import java.util.Scanner;
public class Person {
        public static void main(String[] args) {
        String name1 = "Will";         String name2 = "Jackie";      String name3 = "Sherlock";
        String city1 = "New York";     String city2 = " Shanghai";   String city3 = "London";
        String surname1 = "Smith";     String surname2 = "Chan";     String surname3 = "Holmes";
        String fon1 = "2936729462846"; String fon2 = " 12312412412"; String fon3 = "37742123513";
        String a = personInfo(name1,city1,surname1,fon1);
        System.out.println(a);
        String b =personInfo(name2,city2,surname2,fon2);
        System.out.println(b);
        String c =personInfo(name3,city3,surname3,fon3);
        System.out.println(c);
    }
    static String personInfo(String name,String city,String Surname,String fon){
        String Sum = ("Зателефонувати громадянину "+name+" "+Surname+" із міста "+city+" можна за номером "+fon);
        return Sum;
    }
}
