package ru.skypro;

public class Task6 {
    public static void main(String[] args) {
        testAVGSalary();
    }

    static void testAVGSalary() {
        int[] arr = generateRandomArray();
        double avg = countAVG(arr);
        printAVG(avg);
    }

    static void printAVG(double avg) {
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей.");
    }

    static double countSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static double countAVG(int[] arr) {
        return countSum(arr) / arr.length;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
