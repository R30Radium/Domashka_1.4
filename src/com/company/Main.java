package com.company;

public class Main {

    public static void main(String[] args) {

        //Задание 1

        int x = 1;
        while (x <= 10) {
            System.out.printf("%3d" + (x % 10 == 0 ? "\n" : ""), x);
            x++;
        }
        for (int z = 10; z > 0; z = z - 1) {
            System.out.printf("%3d", z);
        }

        //Задание 2

        for (int friday = 1; friday < 31; friday = friday + 7) {

            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3

        int yearBefore = 1822;
        int yearAfter = 2122;
        for (int year = 0; year <= yearAfter; year = year + 79) {
            if (year >= yearBefore)
                System.out.println(year);
        }


        }
    }
