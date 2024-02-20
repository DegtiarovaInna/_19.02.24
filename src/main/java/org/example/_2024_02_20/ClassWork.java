package org.example._2024_02_20;

public class ClassWork {
    public static void main(String[] args) {
        byte byteValue = 10; //(-128 +127)
        short shortValue = 500; // (-32000 +32000)
        int intValue = 1000000; //(-2 000 000 000 +2 000 000 000) 2^32
        long longValue = 100000000000l;//(-9*10^18  +*10^18) 2^64

        //можно создать переменную и не присваивать ей значение, но для этого должна быть причина
        //float floatValue;
        //для дробных чисел типы данных
        float floatValue = 36.666666666f;
        double doubleValue = 36.6666666666;


        System.out.println(floatValue);
        System.out.println(doubleValue);


        char charValue = 'c'; //2 байта, только одинарные кавычки ставим для char.
        // char - тип данных для символов

        boolean booleanValue = true; // 1 байт

        System.out.println(charValue);

        String string = "Hello";


        int countDown = 10;
        while (countDown >= 0) { // пока выполняется условие в скобках - выполняется тело цикла
            System.out.println(countDown);
            countDown = countDown - 1; //уменьшаем на 1
            //countDown++; аналогично строке выше
        }


        //ctrl+alt+l  - форматировать код
        System.out.println("_______");


        int count = 0;
        while (true) { //создаём бесконечный цикл
            System.out.println(count);
            if (count == 3) {  //создаём условие для выхода из цикла
                break; // оператов выхода из цикла
            }
            count++;  // увеличиваем count на 1;   эквивалентно count = count + 1;
        }


        int count1 = 0;

        do {                                // пример цикла do-while
            System.out.println(count1);     // сначала выполняется тело цикла
            count1++;
        } while (count1 < 11);              // затем проверяется условие


    }
}
