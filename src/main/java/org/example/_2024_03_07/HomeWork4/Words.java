package org.example._2024_03_07.HomeWork4;

import java.util.Scanner;

//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa /вывод - mapa
public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово с четным количеством букв: ");
        String wordOne = scanner.next();

        System.out.println("Введите второе словос четным количеством букв: ");
        String wordTwo = scanner.next();


        if (wordOne.length()%2==0 && wordTwo.length()%2==0) {
            String wordOnehalf = wordOne.substring(wordOne.length()/2); // .substring нашла в интернете, как сделать без?)
            String wordTwoHalf = wordTwo.substring(wordTwo.length()/2);
            String result = wordOnehalf+wordTwoHalf;
            System.out.println("Вот ответ: "+ result);
        } else {
            System.out.println("Вы ввели неверной длины слово");
        }
    }
}
