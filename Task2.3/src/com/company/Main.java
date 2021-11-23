package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void inputArray(int[] arr, int N, Scanner sc, int i) {
        int el = sc.nextInt(); // Ввод элемента массива с клавиатуры
        arr[i] = el;
        if (i != N - 1) { // Если i меньше длины массива - 1
            inputArray(arr, N, sc, i + 1); // Рекурсивный вызов функции
        }
    }

    public static void outputArray(int[] arr, int N, int i) {
        System.out.println(arr[i]); // Вывод элемента массива
        if (i != N - 1) {
            outputArray(arr, N, i + 1); // Рекурсивный вызов функции
        }
    }

    public static void main(String[] args) { // Главный метод (точка входа в программу)
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Введите количество элементов массива: ");
        int N = sc.nextInt(); // Ввод числа
        int i = 0; // Переменная для перебора элементов массива
        int[] A = new int[N]; // Инициализация массива A из N элементов (чисел)

        inputArray(A, N, sc, i); // Вызов метода для ввода массива
        outputArray(A, N, i); // Вызов метода для вывода массива
    }
}
