package ru.skypro;

public class Task4 {
    public static void main(String[] args) {
        printSymbol("aabccddefgghiijjkk");
    }

    public static void printSymbol(String i) {
        System.out.println("Найден первый дублирующийся символ, это символ: " + testString(i) + ".");
    }

    public static char[] changeStringToArray(String string) {
        return string.toCharArray();
    }

    public static char testString(String string) {
        char c[] = changeStringToArray(string);
        char x = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                x = c[i + 1];
                break;
            }
        }
        return x;
    }
}

