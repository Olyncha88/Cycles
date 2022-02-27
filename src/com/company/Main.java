package com.company;
import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i%2 == 0) {
                continue;
            }
            System.out.print(i + "  ");
            }

        System.out.println();
        for (int x = 5; x > 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Введите любое целое положительное число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int y = 1; y < n; y++) {
            sum = sum + y;
        }
        System.out.print("Сумма всех чисел до заданного числа = " + sum);

        System.out.println();

        int b = 7;
        while (b <= 98) {
            System.out.print(b + " ");
            b = b + 7;
        }
        System.out.println();

        for (int c = 0; c >= -45; c = c - 5) {
            System.out.print(c + "  ");
        }
        System.out.println();

        int d = 9;
        while (d <= 20) {
            d++;
            System.out.print((d * d) + " ");
        }
        //
    }
}

