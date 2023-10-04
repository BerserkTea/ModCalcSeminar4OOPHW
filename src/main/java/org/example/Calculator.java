package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public double mult(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double div(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            result /= list.get(i).doubleValue();
        }

        return result;
    }

    public void toDouble(List<? extends Number> list) {

        for (Number number : list) {
            StringBuilder res = new StringBuilder();
            String[] splitted = number.toString().split("\\.");
            res.append(parseToOneNull(splitted[0]));
            res.append(".");
            res.append(parseDrob("0." + splitted[1]));
            System.out.println(res);
        }
    }


    public String parseToOneNull(String number) {
        String resultString = "";
        int numb = Integer.parseInt(number);
        while (numb != 0) {
            resultString += numb % 2;
            numb = numb / 2;
        }

        StringBuilder stringBuilder = new StringBuilder(resultString).reverse();
        return stringBuilder.toString();
    }

    public String parseDrob(String number) {
        String resultString = "";
        double numb = Double.parseDouble(number);
//        System.out.println("numb = " + numb);
        while (numb < 1) {
            resultString += "0";
            numb *= 2;
        }
        resultString += "1";

//        StringBuilder stringBuilder = new StringBuilder(resultString).reverse();
        return resultString;
    }
}
