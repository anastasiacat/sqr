package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int firstNumber, int secondNumber) {
        int count = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt % 1 == 0) { //проверка, что число целое
                count++;
                //System.out.println(i);
            }
        }
        return count;
    }
}
