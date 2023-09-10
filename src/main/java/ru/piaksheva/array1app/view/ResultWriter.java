package ru.piaksheva.array1app.view;

import ru.piaksheva.array1app.model.entity.ArrayData;

import java.util.Arrays;

public class ResultWriter {
    public void printResult(ArrayData arrayData) {
        System.out.println("Количество четных чисел в массиве " + arrayData.getEven());
        System.out.println("Количество нечетных чисел в массиве " + arrayData.getOdd());
        System.out.println("Kоличество простых чисел в массиве " + arrayData.getPrimeNumber());
        System.out.println("Cумма всех чисел в массиве " + arrayData.getSumNumbers());
        System.out.println("Pазность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве " + arrayData.getDiff());
        System.out.println("Количество 0 в массиве " + arrayData.getZeroCounts());
    }
}
