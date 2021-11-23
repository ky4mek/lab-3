package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static double f(double x) { // Функция
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) - 5 * x - 6;
    }

    public static double df(double x) { // 1-я Производная
        return 3 * Math.pow(x, 2) + 4 * x - 5;
    }

    public static double getRootNewton(double x, double eps) {
        double x0 = x;
        x = x0 - f(x) / df(x);
        if (Math.abs(x0 - x) > eps) {
            return getRootNewton(x, eps); // рекурсивный вызов метода
        }
        return x;
    }

    public static double getRootBisection(double left, double right, double eps) {
        double x = 0;
        double dx = 0;
        if (Math.abs(right - left) < eps) { // обычный случай
            return (left + right) / 2; // деление границ отрезка пополам
        } else { // рекурсивный случай
            x = (left + right) / 2; // деление границ отрезка пополам
            if (f(left) * f(x) > 0) {
                return getRootBisection(x, right, eps); // рекурсивный вызов метода
            } else {
                return getRootBisection(left, x, eps); // рекурсивный вызов метода
            }

        }
    }

    public static void main(String[] args) { // Главный метод (точка входа в программу)
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        int x = 5;// вычисляемые приближения для корня
        double a, b, eps;// границы отрезка и точность

        System.out.println("Введите a");
        a = sc.nextDouble();
        System.out.println("Введите b");
        b = sc.nextDouble();
        System.out.println("Введите Eps");
        eps = sc.nextDouble();

        System.out.println("Корень нелинейного уравнения методом Ньютона = " + getRootNewton(x, eps));
        System.out.println("Корень нелинейного уравнения методом бисекции = " + getRootBisection(a, b, eps));
    }
}