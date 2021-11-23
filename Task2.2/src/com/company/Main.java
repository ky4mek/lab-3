package com.company;

public class Main {
    public static int decToBin(int n) { // Метод для перевода с десятичной системы счисления в двоичную
        if (n == 0) { // Если число = 0
            return 0;
        }

        return (n % 2 + 10 * decToBin(n / 2)); // Остаток от деления на 2 + 10 * Вызываем метод, передав в качестве параметра число/2
    }


    public static void main(String[] args) { // Главный метод (точка входа в программу)
        System.out.println(decToBin(20));
    }
}
