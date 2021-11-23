package com.company;

public class Main {
    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) { // Главный метод (точка входа в программу)
        m(1);
    }
}
