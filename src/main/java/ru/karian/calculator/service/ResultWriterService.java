package ru.karian.calculator.service;

public class ResultWriterService {
    public static void printResult(int a, int b, int result, String operName) {
        System.out.println(operName + " " + a + " и " + b + " : " + result);
    }
}
