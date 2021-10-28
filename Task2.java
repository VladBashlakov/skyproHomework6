package ru.skypro;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        int android = 0;
        int iOS = 1;
        int clientDeviceYear = 1995;
        testVersion(clientDeviceYear, iOS);
    }


    public static void testVersion(int clientDeviceYear, int user) {
        int currentYear = LocalDate.now().getYear();
        if (user == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("«Установите версию приложения для iOS по ссылке».");
            } else {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
            }
        }
        if (user == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("«Установите версию приложения для Android  по ссылке».");
            } else {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
            }
        }
    }
}
