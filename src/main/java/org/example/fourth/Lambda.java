package org.example.fourth;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Lambda {
    public static void main(String[] args) {

        IntPredicate isLeapYear = year -> Year.of(year).isLeap();

        BiFunction<LocalDate, LocalDate, Long> daysBetween = (date1, date2) -> ChronoUnit.DAYS.between(date1, date2);

        BiFunction<LocalDate, LocalDate, Long> weeksBetween = (date1, date2) -> ChronoUnit.WEEKS.between(date1, date2);

        Function<LocalDate, DayOfWeek> dayOfWeek = date -> date.getDayOfWeek();

        int year = 2024;
        System.out.println("Год " + year + (isLeapYear.test(year) ? " является високосным" : " не является високосным"));

        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);
        System.out.println("Количество дней между " + date1 + " и " + date2 + ": " + daysBetween.apply(date1, date2));
        System.out.println("Количество полных недель между " + date1 + " и " + date2 + ": " + weeksBetween.apply(date1, date2));

        LocalDate specificDate = LocalDate.of(1969, 7, 20);
        System.out.println("День недели для " + specificDate + ": " + dayOfWeek.apply(specificDate));

        ///// ......
        BiFunction<double[], double[], double[]> addFractions = (frac1, frac2) -> new double[] {
                frac1[0] * frac2[1] + frac2[0] * frac1[1], frac1[1] * frac2[1]
        };

        BiFunction<double[], double[], double[]> subtractFractions = (frac1, frac2) -> new double[] {
                frac1[0] * frac2[1] - frac2[0] * frac1[1], frac1[1] * frac2[1]
        };

        BiFunction<double[], double[], double[]> multiplyFractions = (frac1, frac2) -> new double[] {
                frac1[0] * frac2[0], frac1[1] * frac2[1]
        };

        BiFunction<double[], double[], double[]> divideFractions = (frac1, frac2) -> new double[] {
                frac1[0] * frac2[1], frac1[1] * frac2[0]
        };


        double[] fraction1 = {3, 4};
        double[] fraction2 = {2, 5};

        double[] sum = addFractions.apply(fraction1, fraction2);
        System.out.println("Сумма дробей: " + sum[0] + "/" + sum[1]);

        double[] difference = subtractFractions.apply(fraction1, fraction2);
        System.out.println("Разница дробей: " + difference[0] + "/" + difference[1]);

        double[] product = multiplyFractions.apply(fraction1, fraction2);
        System.out.println("Произведение дробей: " + product[0] + "/" + product[1]);

        double[] quotient = divideFractions.apply(fraction1, fraction2);
        System.out.println("Деление дробей: " + quotient[0] + "/" + quotient[1]);

        Function<int[], Integer> maxOfFour = numbers -> Arrays.stream(numbers).max().orElseThrow();
        Function<int[], Integer> minOfFour = numbers -> Arrays.stream(numbers).min().orElseThrow();

        int[] numbers = {5, 12, 8, 3};
        System.out.println("Максимум из четырёх чисел: " + maxOfFour.apply(numbers));
        System.out.println("Минимум из четырёх чисел: " + minOfFour.apply(numbers));

//        ............................




        IntPredicate isEqualTo = num -> num == 5;
        IntPredicate isOutOfRange = num -> num < 10 || num > 20;
        IntPredicate isPositive = num -> num > 0;
        IntPredicate isNegative = num -> num < 0;


        int[] array = {5, -10, 15, 7, -3, 12};
        System.out.println("Сумма элементов, равных 5: " + sumByCondition(array, isEqualTo));
        System.out.println("Сумма элементов вне диапазона 10-20: " + sumByCondition(array, isOutOfRange));
        System.out.println("Сумма положительных элементов: " + sumByCondition(array, isPositive));
        System.out.println("Сумма отрицательных элементов: " + sumByCondition(array, isNegative));



    }
    static int sumByCondition(int[] array, IntPredicate condition) {
        return Arrays.stream(array).filter(condition).sum();
    }
}
