package org.example._2024_03_07.HomeWork;

import java.util.Scanner;
//Создайте класс Converter - конвертер системы счисления.
//У пользователя спрашивается число системы счисления, (используйте Scanner)
//Запрашивается само число (ожидается корректный ввод)
//У пользователя спрашивается число системы счисления в какую перевести
//Конвертация должна быть с помощью класса обертки Long.
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите систему счислений (2, 8, 10 или 16) вашего числа: ");
        int numberSystemSet = scanner.nextInt();

        if (numberSystemSet!=2 && numberSystemSet!=8 && numberSystemSet!=10 && numberSystemSet!=16){
            System.out.println("Некорректный ввод ");
            return;
        }

        System.out.println("Введите число, которое хотите конвертировать: ");
        String number = scanner.next();



        System.out.println("В какую систему счислений конвертируем (2, 8, 10 или 16): ");
        int numberSystemGet = scanner.nextInt();

        if (numberSystemGet!=2 && numberSystemGet!=8 && numberSystemGet!=10 && numberSystemGet!=16){
            System.out.println("Некорректный ввод ");
            return;
        }

        long numberRes = Long.parseLong(number, numberSystemSet);
        String result = Long.toString(numberRes, numberSystemGet);
        System.out.println("Ваш результат: " + result);



    }
}
