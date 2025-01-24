package org.example.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomArray<T extends Comparable<T>> {
    private T[] array;

//    public CustomArray(int size) {
//        array = (T[]) new Comparable[size];
//    }

//    public void fillFromConsole() {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Введите элемент " + (i + 1) + ": ");
//            array[i] = (T) scanner.next();
//        }
//    }


//    public void fillRandomly(T min, T max) {
//      Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (T) (Object) (min.compareTo(max) < 0 ?
//                    random.nextDouble() * (max.doubleValue() - min.doubleValue()) + min.doubleValue() :
//                    random.nextDouble() * (min.doubleValue() - max.doubleValue()) + max.doubleValue());
//        }
//    }

//    public void display() {
//        System.out.println(Arrays.toString(array));
//    }

}