package org.example._2024_03_07.HomeWork;
//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
public class Pizza {
    public static void main(String[] args) {
        int diameterOld = 24;
        int call = 40;
        int diameterNew =28;


        double areaOldPizza = Math.PI*((diameterOld/2.0)*(diameterOld/2.0));
        double areaNewPizza = Math.PI*((diameterNew/2.0)*(diameterNew/2.0));

        int resultCall = (int)((areaNewPizza*call)-(areaOldPizza*call));
        System.out.println("Лишних каллорий в пицце: " + resultCall);
    }
}
