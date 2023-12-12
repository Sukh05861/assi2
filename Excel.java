package com.example.assiignment1;

import java.util.List;

public class Excel {

    public static double calculateTotal(List<Double> numbers) {
        double total = 0;
        for (Double number : numbers) {
            total += number;
        }
        return total;
    }

    public static double calculateAverage(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        double total = calculateTotal(numbers);
        return total / numbers.size();
    }

    public static double calculateMaximum(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        double max = numbers.get(0);
        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double calculateMinimum(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        double min = numbers.get(0);
        for (Double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}