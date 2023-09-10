package ru.piaksheva.array1app.model.entity;

public class ArrayData {
    int even;
    int odd;
    int primeNumber;
    int sumNumbers;
    int diff;
    int zeroCounts;

    public ArrayData(int even, int odd, int primeNumber, int sumNumbers, int diff, int zeroCounts) {
        this.even = even;
        this.odd = odd;
        this.primeNumber = primeNumber;
        this.sumNumbers = sumNumbers;
        this.diff = diff;
        this.zeroCounts = zeroCounts;
    }

    public int getEven() {
        return even;
    }

    public int getOdd() {
        return odd;
    }

    public int getPrimeNumber() {
        return primeNumber;
    }

    public int getSumNumbers() {
        return sumNumbers;
    }

    public int getDiff() {
        return diff;
    }

    public int getZeroCounts() {
        return zeroCounts;
    }
}
