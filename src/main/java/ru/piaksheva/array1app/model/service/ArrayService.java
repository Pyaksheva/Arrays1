package ru.piaksheva.array1app.model.service;

import ru.piaksheva.array1app.model.entity.ArrayData;

public class ArrayService {
    private int countEven(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private int countOdd(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    private int countPrimeNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNumber(arr[i])) {
                counter++;
            }
        }
        return counter;
    }

    private boolean checkPrimeNumber(int n) {
        for (int devisor = 2; devisor < n; devisor++) {
            if (n % devisor == 0) {
                return false;
            }
        }
        return true;
    }

    private int sumNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private int difference(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + arr[i];
            } else {
                sumOdd = sumOdd + arr[i];
            }
        }
        return sumEven - sumOdd;
    }

    private int countZero(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public ArrayData calculate(int[] arr) {
        int even = countEven(arr);
        int odd = countOdd(arr);
        int primeNumber = countPrimeNumber(arr);
        int sumNumbers = sumNumbers(arr);
        int diff = difference(arr);
        int zeroCounts = countZero(arr);
        ArrayData result = new ArrayData(even, odd, primeNumber, sumNumbers, diff, zeroCounts);
        return result;
    }
}
