package ru.skypro;

public class Task1 {
    public static void main(String[] args) {
        testYear(1992);
    }

    static void testYear(int year) {
        boolean leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        printInfo(leapYear);
    }

    static void printInfo(boolean info) {
        if (info) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
