package ru.piaksheva.array1app.model.service;

public class ArrayService {
    public int countEven(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public int countOdd(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public int countPrimeNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNumber(arr[i])) {
                counter++;
            }
        }
        return counter;
    }

    public boolean checkPrimeNumber(int n) {
        for (int devisor = 2; devisor < n; devisor++) {
            if (n % devisor == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int difference(int[] arr) {
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

    public int countZero(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        return counter;
    }
}
