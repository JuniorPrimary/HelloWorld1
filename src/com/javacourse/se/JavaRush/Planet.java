package com.javacourse.se.JavaRush;


    public class Planet {

        public  String name = "Земля24";

        public  long age = 4_540_000_000L;

        public  int speed = 170_218;

        public  int area = 510_072_000;

        public void printInformation() {
            System.out.println("Имя планеты: " + name + ".");
            System.out.println("Возраст: " + age + " лет.");
            System.out.println("Орбитальная скорость: " + speed + " км/ч.");
            System.out.println("Общая площадь: " + area + " кв. км.");
        }
    }


