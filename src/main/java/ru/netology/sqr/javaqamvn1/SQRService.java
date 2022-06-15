package ru.netology.sqr.javaqamvn1;

public class SQRService {
    public int calcNumber(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= a) {
                if (ii <= b) {
                    count++;
                }
            }
        }
        return count;
    }
}

