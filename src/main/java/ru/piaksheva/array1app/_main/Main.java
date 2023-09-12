package ru.piaksheva.array1app._main;

import ru.piaksheva.array1app.controller.Controller;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 6, 3, -5, 7, 12, 4, -2, 9};
        Controller controller = new Controller();
        controller.calculateEvenCount(arr);
        controller.calculateOddCount(arr);
        controller.calculatePrimeNumber(arr);
        controller.calculateSumNumbers(arr);
        controller.calculateDifference(arr);
        controller.calculateCountZero(arr);
    }
}
