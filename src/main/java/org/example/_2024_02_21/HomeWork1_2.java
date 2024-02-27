package org.example._2024_02_21;

import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
//        int area = squareTrian();
//        System.out.println("площадь треугольника: " + area);
//
//        int areaCube = squareCube();
//        System.out.println("площадь куба: " + areaCube);
//
//
//       int  perimeterTrap =  perimeterTrapezoid();
//        System.out.println("периметр трапеции: " + perimeterTrap);
//
//        int areaSphere = (int) areaSphere();
//        System.out.println("площадь сферы: " + areaSphere);

        int res1 = factorialFor();
        System.out.println(res1);

       int res2= factorialDoWhile();
        System.out.println(res2);

        int res3 =factorialWhile();
        System.out.println(res3);
    }

//Написать математические формулы, в отдельных классах используя Мейн метод:
//-площадь треугольника;


//    public static int squareTrian() {
//
//        Scanner scanner = new Scanner(System.in);
//        int side1 = scanner.nextInt();
//        int side2 = scanner.nextInt();
//        int side3 = scanner.nextInt();
//
//
//        // Вычисляем площадь треугольника по формуле Герона
//        double semiPerimeter = (side1 + side2 + side3) / 2.0;
//        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
//
//        return (int) area;
//
//    }
//
//
//    //-объём куба;
//    public static int squareCube() {
//
//        Scanner scanner = new Scanner(System.in);
//        int sideCube = scanner.nextInt();
//
//
//        int areaCube = 6 * sideCube * sideCube;
//
//
//        return areaCube;
//
//    }
//
//    //-периметр трапеции;
//    public static int perimeterTrapezoid() {
//        Scanner scanner = new Scanner(System.in);
//        int side1 = scanner.nextInt();
//        int side2 = scanner.nextInt();
//        int side3 = scanner.nextInt();
//        int side4 = scanner.nextInt();
//
//        int perimeterTrap = side1+side2+side3+side4;
//
//
//        return perimeterTrap;
//    }
//
////-площадь сферы.
//public static double areaSphere(){
//    Scanner scanner = new Scanner(System.in);
//    double radius = scanner.nextDouble();
//
//    double areaSphere = 4 * Math.PI * radius * radius;
//    return areaSphere;
//}
//   Написать программу, которая принимает в качестве аргумента число из консоли используя Scanner.
//    программа должна вывести на экран результат факториала этого числа 3 раза, используя разные методы.
//
//            написать 3 реализации ('3 метода'):
//            1.используя цикл while
//            2.используя цикл do-while
//            3.используя цикл for
//
//    Пример факториала числа 5 = 1 * 2 * 3 * 4 * 5 = 120;
//    числа 3 = 1 * 2 * 3  = 6;

    public static int factorialFor(){
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;

        }
        return res;
    }

    public static int factorialDoWhile(){
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int res = 1;
        int i =1;
        do  {
            res *= i;
            i++;
        } while (i<=number);
        return res;
    }

    public static int factorialWhile(){
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int res = 1;
        int i =1;
        while (i <= number) {
            res *= i;
            i++;
        }
        return res;
    }
}
