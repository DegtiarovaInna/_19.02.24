package org.example._2024_03_07.HomeWork5;

import java.util.Arrays;

//  1. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
// Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c
// оказалась строго возрастающей.
public class ThreeNumbers {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 5;
        int number3 = 8;

        //1)массивы
//        int[] numbers = {number1, number2, number3};
//        Arrays.sort(numbers);
//        System.out.println("Числа в порядке возрастания: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        //2)без массива
        if (number1<number2 && number1<number3){
            if(number2<number3){
                System.out.println(number1 +" "+ number2+" " + number3);
            } else {
                System.out.println(number1+" "+number3+" "+number2);
            }
        } else if (number2<number1 && number2<number3) {
            if (number1<number3){
                System.out.println(number2+" "+number1+" "+number3);
            } else {
                System.out.println(number2+" "+number3+" "+number1);
            }
        } else if (number3<number1 && number3<number2) {
           if (number1<number2){
               System.out.println(number3+" "+number1+" "+number2);
           } else {
               System.out.println(number3+" "+number2+" "+number1);
           }

        }
    }
}
