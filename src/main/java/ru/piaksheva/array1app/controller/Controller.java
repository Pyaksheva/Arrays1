package ru.piaksheva.array1app.controller;

import ru.piaksheva.array1app.model.service.ArrayService;
import ru.piaksheva.array1app.view.ResultWriter;

public class Controller {
    ArrayService arrayService = new ArrayService();
    ResultWriter resultWriter = new ResultWriter();

    public void calculateEvenCount(int[] arr) {
        int result = arrayService.countEven(arr);
        resultWriter.printResult("Количество четных чисел в массиве ", result);
    }

    public void calculateOddCount(int[] arr) {
        int result = arrayService.countOdd(arr);
        resultWriter.printResult("Количество нечетных чисел в массиве ", result);
    }

    public void calculatePrimeNumber(int[] arr) {
        int result = arrayService.countPrimeNumber(arr);
        resultWriter.printResult("Kоличество простых чисел в массиве ", result);
    }

    public void calculateSumNumbers(int[] arr) {
        int result = arrayService.sumNumbers(arr);
        resultWriter.printResult("Cумма всех чисел в массиве ", result);
    }

    public void calculateDifference(int[] arr) {
        int result = arrayService.difference(arr);
        resultWriter.printResult("Pазность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве ", result);
    }

    public void calculateCountZero(int[] arr) {
        int result = arrayService.countZero(arr);
        resultWriter.printResult("Количество 0 в массиве ", result);
    }
}
