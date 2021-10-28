package ru.skypro;

public class Task3 {

    public static void main(String[] args) {
        printDeliveryTime(51);
    }

    public static int testDeliveryTime(int deliveryDistance) {
        int numbers = 0;
        if (deliveryDistance <= 20) {
            numbers = 1;
        } else if (deliveryDistance <= 60) {
            numbers = 2;
        } else if (deliveryDistance <= 100) {
            numbers = 3;
        }
        return numbers;
    }

    static void printDeliveryTime(int i) {
        System.out.println("Потребуется дней: " + testDeliveryTime(i));
    }
}
