package com.company;

public class Main {
    public static int fact(int n) {
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }

    public static void main(String[] args) { // Главный метод (точка входа в программу)
        System.out.println(fact(5));
    }
}
