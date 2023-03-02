package com.hillel.kubenko.homeworks.homeworks10;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//        Другий масив - це числа, які вгадав гравець.
//       Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//        [0, 1, 4, 5, 5, 8, 9]
//        [1, 1, 2, 3, 5, 6, 9]
//        Кількість збігів: 3

        int[] first = new int[7];
        System.out.print("Перший масив: ");
        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(10);
            System.out.print(first[i] + " ");
        }
        System.out.println();

        int[] second = new int[7];
        System.out.print("Другий масив: ");
        for (int i = 0; i < second.length; i++) {
            second[i] = random.nextInt(10);
            System.out.print(second[i] + " ");
        }
        System.out.println();

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.print("Перший масив (відсортований): ");
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();

        System.out.print("Другий масив (відсортований): ");
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
        System.out.println();

        int matches = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                matches++;
                System.out.println("Збіги в "+i+" елементі");
            }
        }

        System.out.println("Кількість збігів: " + matches);

    }
}
