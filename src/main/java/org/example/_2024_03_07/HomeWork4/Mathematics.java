package org.example._2024_03_07.HomeWork4;

import java.util.Scanner;

//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел /Вычитания двух чисел
//Умножения двух чисел  /Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.
public class Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int numb1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int numb2 = scanner.nextInt();

       int add =addition(numb1, numb2);
        System.out.println("Результат сложения: " + add);

        int sub =subtraction(numb1, numb2);
        System.out.println("Результат вычитания: " + sub);

        int mult =multiplication(numb1, numb2);
        System.out.println("Результат умножения: " + mult);

        double div =division(numb1, numb2);
        System.out.println("Результат деления: " + div);
    }

    public static int addition(int numb1, int numb2){
        int add = numb1+numb2;
        return add;
    }

    public static int subtraction(int numb1, int numb2){
        int sub = numb1-numb2;
        return sub;
    }

    public static int multiplication(int numb1, int numb2){
        int mult = numb1*numb2;
        return mult;
    }

    public static double division(double numb1, double numb2){
        double div =1;
       if (numb2!=0){
           div = numb1/numb2;
           return div;
       } else{
           System.out.println("На ноль делить нельзя");
           return 0;
       }


    }

}
