package org.example._2024_02_21;

public class Lesson_3 {
    public static void main(String[] args) {


        // Вывести на экран в одну строку все нечётные числа от 0 до 100.
//       //1)
//        for(int i=0; i<=100; i++){
//            if (i%2==1) {
//                System.out.println(i);
//            }
//        }
//
//        //2)
//        for(int i=1; i<=100; i+=2){   //(i=i+2)
//
//                System.out.print(i+" ");
//        }
//
//        //3)
//        int i=1;
//        while (i<100){
//            System.out.print(i+" ");
//            i+=2;
//        }

//        Дано 5 чисел:  а=10,  b=15, c= 20, d=25, e=30.
//        Переприсвоить и вывести их на экран в том же порядке(a,b,c,d,e), НО, таким образом,
//        чтобы каждая переменная принимала “следующее” значение из этой цепочки.
//        Пример: было а=10 стало а=15;  было е=30 стало е=10.
//        Примечание: присваивать “напрямую” значения нельзя, все манипуляции должны происходить за счёт
//        переменных, а не их значений.


//        int a=10, b=15, c= 20, d=25, e=30;
//        int tempA = a, tempB = b, tempC = c, tempD = d, tempE = e;
//        a = tempB;
//        b = tempC;
//        c = tempD;
//        d = tempE;
//        e = tempA;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);
//
//


        //2)
//        int a=10, b=15, c= 20, d=25, e=30;
//        int temp = a;
//        a = b;
//        b = c;
//        c = d;
//        d = e;
//        e = temp;
//
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);


        //     Создать программу которая принимает на вход 3 вещественных числа, и будет выводить на экран ТО число,
        //        чей остаток от деления на 1.5 -  меньше остальных. Для наглядности выводить и сам остаток.
//        double a = 3.5;
//        double b = 10.7;
//        double c = 9.9;
//
//        double remainderA = a % 1.5;
//        double remainderB = b % 1.5;
//        double remainderC = c % 1.5;
//
//        if (remainderA < remainderB && remainderA < remainderC) {
//            System.out.println(a);
//        } else if (remainderB < remainderA && remainderB < remainderC) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }


        //      Даны три переменные, вещественные числа number1, number2, и символьный operation, который может содержать следующие символы (+ - * /).
//        Написать программу "Калькулятор" которая будет выводить на консоль результат соответствующих вычислений.
//1)
//        double number1 =15.5;
//        double number2 = 0;
//        char operation = '/';
//        double result = 0;
//
//        if (operation == '+') {
//            result = number1 + number2;
//            System.out.println("Результат: " + result);
//        } else if (operation == '-') {
//            result = number1 - number2;
//            System.out.println("Результат: " + result);
//        } else if (operation == '*') {
//            result = number1 * number2;
//            System.out.println("Результат: " + result);
//        } else if (operation == '/') {
//            if (number2 == 0) {
//                System.out.println("Деление на ноль невозможно!");
//            } else {
//                result = number1 / number2;
//                System.out.println("Результат: " + result);
//            }
//        }
        //2)
        // Задаем входные данные: два числа и операцию
//        double number1 = 15.5;
//        double number2 = 25.5;
//        char operation = '+';
//
//        double result; // Объявляем переменную для хранения результата вычислений
//
//        // Используем оператор switch для выполнения различных действий в зависимости от значения переменной operation
//        switch (operation) {
//            // В случае, если operation равно символу '+'
//            case '+':
//                // Выполняем операцию сложения
//                result = number1 + number2;
//                // Выводим результат на экран
//                System.out.println("Результат: " + result);
//                // Завершаем выполнение оператора switch
//                break;
//            // В случае, если operation равно символу '-'
//            case '-':
//                // Выполняем операцию вычитания
//                result = number1 - number2;
//                // Выводим результат на экран
//                System.out.println("Результат: " + result);
//                // Завершаем выполнение оператора switch
//                break;
//            // В случае, если operation равно символу '*'
//            case '*':
//                // Выполняем операцию умножения
//                result = number1 * number2;
//                // Выводим результат на экран
//                System.out.println("Результат: " + result);
//                // Завершаем выполнение оператора switch
//                break;
//            // В случае, если operation равно символу '/'
//            case '/':
//                // Проверяем, что делитель (number2) не равен нулю
//                if (number2 == 0) {
//                System.out.println("Деление на ноль невозможно!");
//            } else {
//                result = number1 / number2;
//                System.out.println("Результат: " + result);
//            }
//                // Завершаем выполнение оператора switch
//                break;
//            // В случае, если значение operation не совпадает ни с одним из символов '+', '-', '*', '/'
//            default:
//                // Выводим сообщение о некорректной операции
//                System.out.println("Некорректная операция!");
//                // Завершаем выполнение оператора switch
//        }


        //  В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.

        int count = 0;
        for (int i = 0; i <= 100; i++) {
//            if (i%2==0 && i%10!=0){
//                System.out.println(i);
//            }
//        }

            if (count == 26) {
                break;
            }
            if (i % 2 == 0 && i % 10 != 0) {
                count++;
                System.out.println(i);
            }


        }

        //Homework в разных классах. Отступы, логично названные переменные Сторона, высота
        //Написать математические формулы, в отдельных классах используя Мейн метод:
        //-площадь треугольника;
        //-объём куба;
        //-периметр трапеции;
        //-площадь сферы.
        //
        //Домашка на "погуглить" (наверняка java знает как возводить в степень или извлекать корень)
    }
}
