package addy;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество пар скобок (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try {
            BigInteger result = ParenthesisCounter.countWellFormedParenthesis(n);
            System.out.println("Количество корректных комбинаций скобок для n = " + n + ": " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}