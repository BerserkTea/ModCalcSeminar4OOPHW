package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println(calculator.mult(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println(calculator.div(new ArrayList<>(Arrays.asList(12, 6, 2))));
        calculator.toDouble(new ArrayList<>(Arrays.asList( 12.003, 12.01, 6.2132, 2.15, 13.223, 13.0)));
    }
}