package ru.karian.calculator._main;

import ru.karian.calculator.service.ResultWriterService;
import ru.karian.calculator.util.Calculator;

public class _Main {
    public static void main(String[] args) {

        int firstResult = Calculator.countSum(36, 48);
        ResultWriterService.printResult(36, 48, firstResult, "Сумма");

        int secondResult = Calculator.countResidual(34, 23);
        ResultWriterService.printResult(34, 23, secondResult, "Разность");

        int thirdResult = Calculator.countProduct(23, 24);
        ResultWriterService.printResult(23, 24, thirdResult, "Умножение");


    }
}
