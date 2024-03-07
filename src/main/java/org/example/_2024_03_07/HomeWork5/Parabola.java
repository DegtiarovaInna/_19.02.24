package org.example._2024_03_07.HomeWork5;
//В три переменные a, b и c записаны три вещественных числа.
// Создать программу, которая будет находить и выводить на экран вещественные корни
// квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
public class Parabola {
    public static void main(String[] args) {
        double a = 1;
        double b = 4;
        double c = 2;

        double discriminant = b*b-4*a*c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Первый корень: " + x1);
            System.out.println("Второй корень: " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Единственный корень: " + x);
        } else {
            System.out.println("Корней нет");
        }
    }
}
